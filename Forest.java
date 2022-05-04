class Forest extends Terrain {
  public String name() {
    return "Forest";
  }
  public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealthPoints();
    target.setHealthPoints(targetHealth - 10);
  }
}