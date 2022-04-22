public class Lake extends WaterTerrain {
    public Lake(String name) {
        super(name);
    }

    public String type() {
        return "Lake";
    }
  

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public String sku() {
        return "lake0001";
    }
}