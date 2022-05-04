class Bird extends Animal {
  String name;
  Bird(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public String animalType() {
    return "Striker";
  }
  
  public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealthPoints();
    target.setHealthPoints(targetHealth - 12);
  }
}