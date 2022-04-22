public class Scorpion extends EarthAnimal {
    public Scorpion(String name) {
        super(name);
    }

    public String species() {
        return "Scorpion";
    }

    public int HealthPoints() {
        return 100;
    }


    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "scorpion0001";
    }
}