class Bird extends WindAnimal {
    Bird(String name) {
        super(name);
    }

    public String species() {
        return "Bird";
    }
    
    public int HealthPoints() {
        return 100;
    }
  
    public void inflictDamageTo(IDamagable target){
      int targetHealth = target.getHealthLevel();
      target.setHealthLevel(targetHealth - 20);
  }
}

