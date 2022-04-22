public class Cave extends EarthTerrain {
    public Cave(String name) {
        super(name);
    }

    public String type() {
        return "Cave";
    }
  

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "cave0001";
    }
}