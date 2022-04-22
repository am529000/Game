public abstract class Animal {
    private String _name;

    // Default constructor
    protected Animal() {
        this._name = "un-named";
    }

    // A Constructor that takes a name for the animal
    protected Animal(String name) {
        this._name = name;
    }

    public abstract String species();

    public abstract String element();

    public abstract int HealthPoints();

    // The given (pet) name of the animal
    public String name() {
        return this._name;
    }

    public String toString() {
        return String.format("Hi, I'm %s, a %s. %s. %s.", this.name(), this.species(), this.element(), this.HealthPoints());
    }
}