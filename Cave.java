class Cave extends Terrain {
  public String name() {
    return "Cave";
  }
  public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealthPoints();
    target.setHealthPoints(targetHealth - 5);
  }
}
  