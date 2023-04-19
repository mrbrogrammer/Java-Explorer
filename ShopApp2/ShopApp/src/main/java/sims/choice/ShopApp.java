package sims.choice;

public class ShopApp {
    public static void main(String[] args) {
        int measurement = 8;
        
        Customer pinky = new Customer();
        pinky.size = "S";
        
        switch (measurement) {
            case 1, 2, 3:
                pinky.size = "S";
                break;
            case 4, 5, 6:
                pinky.size = "M";
                break;
            case 7, 8, 9:
                pinky.size = "L";
                break;
            default:
                pinky.size = "X";
                break;
        }
    
        System.out.println("size = " + pinky.size);
    }
    
    static class Customer {
        String size;
    }
}