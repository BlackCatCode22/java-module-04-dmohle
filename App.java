package dennis.zoo.com;

// dH 9/26/24
// App.java
// Driver file for the zoo midterm program.

public class App {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my Zoo Program!\n");

        System.out.println("\n Number of animals is: " + dennis.zoo.com.Animal.numOfAnimals);

        dennis.zoo.com.Animal myAnimal = new dennis.zoo.com.Animal();
        myAnimal.setAnimalName("my first animal");
        System.out.println("\n The name of the new animal is: " + myAnimal.getAnimalName());

        dennis.zoo.com.Animal anotherAnimal = new dennis.zoo.com.Animal("Zig");
        System.out.println("\n The name of the second animal is: " + anotherAnimal.getAnimalName());

        System.out.println("\n Number of animals is: " + dennis.zoo.com.Animal.numOfAnimals);

        // Create a hyena with a name
        dennis.zoo.com.Hyena aNewHyena = new dennis.zoo.com.Hyena("Kamari");

        System.out.println(" The new hyena's name is: " + aNewHyena.getAnimalName());

        System.out.println("\n Number of animals is: " + dennis.zoo.com.Animal.numOfAnimals);




    }
}