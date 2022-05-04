class Lake extends Terrain {
  public String name() {
    return "Lake";
  }
  public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealthPoints();
    target.setHealthPoints(targetHealth - 15);
  }
}