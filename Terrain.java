abstract class Terrain implements IDamaging {
  abstract public String name();
  
  public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealthPoints();
    target.setHealthPoints(targetHealth - 1);
  }
}