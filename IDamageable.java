interface IDamageable {
   
  int getHealthPoints();
  void setHealthPoints(int Points);

  int getFireLevel();
  void setFireLevel(int Level);

  int getWaterLevel();
  void setWaterLevel(int Level);

  int getEarthLevel();
  void setEarthLevel(int Level);

  int getWindLevel();
  void setWindLevel(int Level);
  
  boolean isDefeated();
} 