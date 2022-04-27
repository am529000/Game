public abstract class FireTerrain extends Terrain {
    public FireTerrain(String name) {
        super(name);
    }

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public abstract String sku();

    public String toString() {
        return String.format("%s.", super.toString());
    }
}