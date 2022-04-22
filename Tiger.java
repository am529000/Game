public class Tiger extends FireAnimal {
    public Tiger(String name) {
        super(name);
    }

    public String species() {
        return "Tiger";
    }

    public int HealthPoints() {
        return 100;
    }

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "tiger0001";
    }
}