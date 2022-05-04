class Fish extends Animal {
  String name;
  Fish(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public String animalType() {
    return "FishStick";
  }
  
  public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealthPoints();
    target.setHealthPoints(targetHealth - 13);
  }
}