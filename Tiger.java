class Tiger extends Animal {
  String name;
  Tiger(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public String animalType() {
    return "Tony";
  }
  
  public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealthPoints();
    target.setHealthPoints(targetHealth - 15);
  }
}