abstract class Animal implements IDamageable, IDamaging {
  abstract public String getName();
  abstract public String animalType();

  int health = 100;
  public int getHealthPoints() {
    return this.health;
  }
  public void setHealthPoints(int points) {
    this.health = points;
  }
 
  int fire = 100;
  public int getFireLevel() {
    return this.fire;
  }
  public void setFireLevel(int level) {
    this.fire = level;
  }

  int water = 100;
  public int getWaterLevel() {
    return this.water;
  }
  public void setWaterLevel(int level) {
    this.water = level;
  }
  
  int earth = 100;
  public int getEarthLevel() {
    return this.earth;
  }
  public void setEarthLevel(int level) {
    this.earth = level;
  }

  int wind = 100;
  public int getWindLevel() {
    return this.wind;
  }
  public void setWindLevel(int level) {
    this.wind = level;
  }

  public boolean isDefeated() {
    return this.health < 10;
  }

  public void inflictDamageTo(IDamageable target){
    int targetHealth = target.getHealthPoints();
    int fireDifference = this.fire - target.getFireLevel();
    int waterDifference = this.water - target.getWaterLevel();
    int earthDifference = this.earth - target.getEarthLevel();
    int windDifference = this.wind - target.getWindLevel();
    target.setHealthPoints(targetHealth - 10 + fireDifference + waterDifference + earthDifference + windDifference);
  }
}