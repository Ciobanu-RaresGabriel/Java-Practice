package Animal;
//Write a Java program to create a class called Animal with a method called makeSound().
// Create a subclass called Cat that overrides the makeSound() method to bark
public class Animal {

    public void makeSound(){
        System.out.println("Animalul scoate un sunet.");
    }

}

class Cat extends Animal{

    public void makeSound(){
        System.out.println("Pisica mea face: Meoww Meeeoooowwwwww");
    }
}