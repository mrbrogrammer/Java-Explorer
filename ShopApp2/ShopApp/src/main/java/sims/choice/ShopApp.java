package sims.choice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/**
Create an array of Clothing objects and populate it using existing
        clothing object references.
        - This array should be added to the main method of the ShopApp class.
        - Declare and initialize variable items type of the Clothing array. - This code should be placed after existing clothing items are created, before
        the code that does total calculation.
*/

public class ShopApp {
    static final double TAX = 0.2;
    public static void main(String[] args) {
        Clothing item1 = new Clothing("T-shirt", "S", 20.9);
        Clothing item2 = new Clothing("Trucker Cap", "M", 10.5);
        Clothing item3 = new Clothing("Trucker Cap", "M", 10.5);
        
        Clothing item4 = new Clothing("Green Scarf", "S", 5);
        Clothing item5 = new Clothing("Blue T-Shirt", "S", 10.5);
    
        Clothing[] items = {item1, item2, item3, item4, item5};
    
        Customer customer = new Customer();
        customer.size = "M";
        
        Clothing[] filteredItems = new Clothing[items.length];
    
        int count = 0;
        double result = 0;
        for (Clothing item : items) {
            if (item.size.equals(customer.size)) {
                result += item.price;
                if (result * (1 + TAX) > 15) {
                    break;
                } else {
                    System.out.printf("Description : %s\n", item.description);
                    System.out.printf("Price : %.2f\n", item.price);
                    System.out.printf("Size : %s\n", item.size);
                    filteredItems[count] = item;
                }
            }
            count++;
        }
        
        // 20% / 100 * price
//        System.out.printf("%.2f%n", result );
        
    }
    
    static class Customer {
        String size;
    }
}