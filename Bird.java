public class Bird extends WindAnimal {
    public Bird(String name) {
        super(name);
    }

    public String species() {
        return "Bird";
    }
    
    public int HealthPoints() {
        return 100;
    }
  

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "bird0001";
    }
}