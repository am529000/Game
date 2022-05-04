import java.util.Random;

class Game {
  Animal player1, player2;
  Terrain terrain;

  void startGame() {
    this.show(String.format("Welcome to Vaint, the 1v1 Battler!"));

    this.player1 = this.selectPlayer("P1");

    this.player2 = this.selectPlayer("P2");

    int round = 1;
    while (!this.isGameOver()) {
      this.terrain = this.selectTerrain();
      this.updateGameStatus(round);
      this.pause();

      this.engageBattle();

      round++;
    }
  }

  void engageBattle() {
   
    if (new Random().nextInt(10) < 5)
      this.performAction(this.player1, this.player2);
    else
      this.performAction(this.player2, this.player1);
    this.pause();

    this.show(String.format("The %s is affecting the players", this.terrain.name()));
    this.terrain.inflictDamageTo(this.player1);
    this.terrain.inflictDamageTo(this.player2);
    this.pause();
  }

  void performAction(Animal p1, Animal p2) {
    this.show(String.format("%s is attacking %s", p1.getName(), p2.getName()));
    p1.inflictDamageTo(p2);
    }

  boolean isGameOver() {
    if (this.player1.isDefeated()) {
      this.show(String.format("%s is defeated!", this.player1.getName()));
      return true;
    } else if (this.player2.isDefeated()) {
      this.show(String.format("%s is defeated!", this.player2.getName()));
      return true;
    }
    return false;
  }

  Animal selectPlayer(String name) {
  int random = new Random().nextInt(4);  
    switch (random) {
      case 0:
        return new Tiger(name);
      case 1:
        return new Fish(name);
      case 2:
        return new Bird(name);
      default:
        return new Mole(name);
    }
  }
  Terrain selectTerrain() {
    int random = new Random().nextInt(4);
    switch (random) {
      case 0:
        return new Cave();
      case 1:
        return new Forest();
      case 2: 
        return new Lake();
      default:
        return new Desert();
    }
  }

  void updateGameStatus(int round) {
    this.show(String.format("%s: %s - %d | %s: %s - %d",
        this.player1.getName(), this.player1.animalType(), this.player1.getHealthPoints(),     
        this.player2.getName(), this.player2.animalType(), this.player2.getHealthPoints()));
    this.show("-----------------------------------------------");
    this.show(String.format("Terrain: %s", this.terrain.name()));
    this.show(String.format("Round %d", round));
  }

  void show(String text) {
    System.out.println(text);
  }

  void pause() {
    this.pause(2 * 1000);
  }

  void pause(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (Exception e) {
      this.show(e.toString());
    }
  }
}