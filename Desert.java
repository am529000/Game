public class Desert extends FireTerrain {
    public Desert(String name) {
        super(name);
    }

    public String type() {
        return "Desert";
    }
  

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "desert0001";
    }
}