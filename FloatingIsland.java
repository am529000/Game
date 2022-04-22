public class FloatingIsland extends WindTerrain {
    public FloatingIsland(String name) {
        super(name);
    }

    public String type() {
        return "FloatingIsland";
    }
  

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "cave0001";
    }
}