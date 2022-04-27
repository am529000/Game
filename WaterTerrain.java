public abstract class WaterTerrain extends Terrain {
    public WaterTerrain(String name) {
        super(name);
    }

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public abstract String sku();

}