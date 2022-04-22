public abstract class Terrain {
    private String _name;

    // Default constructor
    protected Terrain() {
        this._name = "un-named";
    }

    // A Constructor that takes a name for the animal
    protected Terrain(String name) {
        this._name = name;
    }

    public abstract String type();

  
    public String name() {
        return this._name;
    }

    public String toString() {
        return String.format("Terrain: %s.", this.type());
    }
}