package com.sims;

public class ShopApp {
    static final double TAX = 0.2;
    public static void main(String[] args) {
        Clothing item1 = new Clothing("T-shirt", "S", 20.9);
        Clothing item2 = new Clothing("Trucker Cap", "M", 10.5);
        
        
        double total = item1.price + (item2.price * 2);
        // 20% / 100 * price
        
        System.out.printf("%.2f%n", total * (1 + TAX));
    }
}