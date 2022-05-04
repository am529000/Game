class Game {
  Animal player1, player2;
  Terrain terrain;
  
  void startGame() {
    
    
    // Select a creature (player 1)
    this.player1 = this.selectPlayer("Player 1");
    // Configure the creature
 
    // Select an opopnent (player 2)
    this.player2 = this.selectPlayer("Player 2");
    // Configure the opponent

    // Select an environment
    this.terrain = this.selectTerrain();

    // Start the battle rounds, continue until one creture is defeated
    int round = 1;
    boolean gameOver = false;
    while(!gameOver) {
      // Display game status
      this.updateGameStatus(round);
      this.pause();

      // Do a round of combat
      this.engageBattle();
     
      // Determine if the game is over
      if (this.isGameOver()) break;
      
      round++;
    }
  }

  void engageBattle() {
      // TODO Decide who gets to attack in this round
      // Attack
      this.show(String.format("%s is attacking %s", this.player1.getName(), this.player2.getName()));
      this.player1.inflictDamageTo(this.player2);
      this.show(String.format("%s is attacking %s", this.player2.getName(), this.player1.getName()));
      this.player2.inflictDamageTo(this.player1);
      this.pause();
      
      // TODO Decide if the environment inflicts damage to the players
      // Inflict damage
      this.show(String.format("The %s is affecting the players", this.terrain.name()));
      this.terrain.inflictDamageTo(this.player1);
      this.terrain.inflictDamageTo(this.player2);
      this.pause();
  }

  boolean isGameOver() {
      if (this.player1.isDefeated()) {
        this.show(String.format("%s has been defeated!", this.player1.getName()));
        return true;
      }
      else if (this.player2.isDefeated()) {
        this.show(String.format("%s has been defeated!", this.player2.getName()));
        return true;
      }
      return false;
  }

  Animal selectPlayer(String name) {
    // TODO let user pick from a selection!
    return new Tiger(name);
  }

  Terrain selectTerrain() {
    // TODO random or let the user pick from a selection!
    return new Cave();
  }

  void updateGameStatus(int round) {
    this.show(String.format("Player 1: %s - %d | Player 2: %s - %d",
                           this.player1.animalType(), this.player1.getHealthPoints(),
                           this.player2.animalType(), this.player2.getHealthPoints()));
    this.show(String.format("Terrain: %s", this.terrain.name()));
    this.show(String.format("Round %d", round));
  }

  void show(String text) {
    System.out.println(text);
  }

  void pause() {
    this.pause(4 * 1000);
  }
  void pause(int milliseconds) {
    try{
      Thread.sleep(milliseconds);
      }
    catch(Exception e) {
      this.show(e.toString());
    }
  }
}