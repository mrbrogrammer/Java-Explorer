package sims.choice;

public class Clothing {
    String description;
    String size = "M";
    double price;
    
    
    public Clothing() {
    }
    
    public Clothing(String description, String size, double price) {
        this.description = description;
        this.size = size;
        this.price = price;
    }
}
