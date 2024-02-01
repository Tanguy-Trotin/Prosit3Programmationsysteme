package singletonProsit;

// Interface pour définir le produit
// Interface pour définir le produit
interface Animal {
    void makeSound();
}

// Implémentations concrètes du produit
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Interface de la fabrique
interface AnimalFactory {
    Animal createAnimal();
}

// Implémentations concrètes de la fabrique
class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

// Classe de test
public class Factory {
    public static void main(String[] args) {
        // Utilisation de la fabrique pour créer des animaux
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound();  // Produira "Woof!"

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeSound();  // Produira "Meow!"
    }
}