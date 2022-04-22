public class Fish extends WaterAnimal {
    public Fish(String name) {
        super(name);
    }

    public String species() {
        return "Fish";
    }

    public int HealthPoints() {
        return 100;
    }

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "Fish0001";
    }
}