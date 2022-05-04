class Desert extends Terrain {
  public String name() {
    return "Desert";
  }
  public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealthPoints();
    target.setHealthPoints(targetHealth - 12);
  }
}