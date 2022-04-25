class Game{
  Animal player1, player2;
  Terrain terrain;

  void startGame(){

    this.terrain = this.selectTerrain();


    Terrain selectTerrain() {
    // random Terrain
    return new RandomTerrain();
  }
  
}