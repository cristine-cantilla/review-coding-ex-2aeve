class Animal {  //Superclass (base Class)
    public void makeSound() {
        System.out.println("Some generic animal sound.");

    }
}
class Dog extends Animal {  //Subclass (Derived Class)
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}
class Main {
    public static void main(String[] args) {
        //Create instances of Animal and Dog classes
        Animal objAnimal = new Animal();
        Dog objDog = new Dog();

        //Call methods from both classes
        objAnimal.makeSound();  //Method Call for Superclass
        objDog.makeSound();   //Method Call for Subclass inheriting makeSound() method
        objDog.bark();  //Method Call for Subclass bark() method
    }
    }
