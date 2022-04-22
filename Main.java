class Main {
    public static void main(String[ ] args) {
        // Create a bunch of animals
        var animals = new Animal[] {
            new Tiger("Tony"),
            new Bird("Striker"),
            new Fish("Fishstik"),
            new Scorpion("Stinger"),
        };

        // Let each animal print themselves
        for (var animal: animals) {
            System.out.println(animal);

        var terrains = new Terrain[] {
            new Cave("Cave"),
            new Lake("Lake"),
            new Desert("Desert"),
            new FloatingIsland("Floating Island"),
        };

        for (var terrain: terrains) {
            System.out.println(terrain);
        }
     }
  }
}