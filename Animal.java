abstract class Animal implements IDamageable, IDamaging {
  abstract private String name();
  abstract private String animalType();

  int health = 100;
  public int getHealthPoints() {
    return this.health;
  }
  public void setHealthPoints(int level) {
    this.health = level;
  }

  public void inflictDamageTo(IDamagable target){
    int targetHealth = target.getHealthPoints();
    target.setHealth(targetHealth - 10);
  }




}