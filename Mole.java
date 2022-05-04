class Mole extends Animal {
  String name;
  Mole(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public String animalType() {
    return "Holi";
  }
  
  public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealthPoints();
    target.setHealthPoints(targetHealth - 14);
  }
}