public abstract class FireAnimal extends Animal implements IDamageable{
    public FireAnimal(String name) {
        super(name);
    }

    // Stock Keeping Unit - a unique identifier for cataloging and inventory purposes
    public abstract String sku();

    public int HealthPoints() {
        return 100;
    }

    public void SetMaxHealthPoints() {
    }

    public void SetHealthPoints() {
    }

    public void GetHealthPoints() {
    }
  
    public String element() {
        return "Fire";
    }

    public String toString() {
        return String.format("%s.", super.toString());
    }
}