import java.util.Random;

class Game{
  Animal player1, player2;
  Terrain terrain;

  void startGame(){
    

    //generate animal
    var bird = new Bird();
    var fish = new Fish();
    var scorpion = new Scorpion();
    var tiger = new Tiger();

    //show animals to choose 
    var animals = new ArrayList<Animal>();
    animals.add(bird);
    animals.add(fish);
    animals.add(scorpion);
    animals.add(tiger);
    int n = animals.size(); //animals in array list
    for(int i =0; i < n; i++) {
      var animal = animals.get(i);

    this.show(String.format("%s. %s.", i, animal.species()));
    }

    this.terrain = this.selectTerrain();
    
    }
    
    }
    
    Terrain selectTerrain() {  //random terrain
      if (new Random().nextInt(10) < 5)
        return new Desert();
        return new Lake();
        return new FLoatingIsland();
      return new Cave();
    }
      
    

    
    void show(String text) {
      System.out.println(text);
    }
      
    
  
  
}