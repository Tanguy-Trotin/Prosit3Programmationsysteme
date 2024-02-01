package singletonProsit;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryTest {

    @Test
    public void testCreateDog() {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();

        assertNotNull(dog);
        assertTrue(dog instanceof Dog);

        // Teste si le chien émet le bon son
        assertEquals("Dog says Woof!", getAnimalSound(dog));
    }

    @Test
    public void testCreateCat() {
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();

        assertNotNull(cat);
        assertTrue(cat instanceof Cat);

        // Teste si le chat émet le bon son
        assertEquals("Cat says Meow!", getAnimalSound(cat));
    }

    private String getAnimalSound(Animal animal) {
        // Retourne le son de l'animal
        return animal == null ? "" : animal.getClass().getSimpleName() + " says " + getSound(animal);
    }

    private String getSound(Animal animal) {
        // Récupère le son spécifique de l'animal
        if (animal instanceof Dog) {
            return "Woof!";
        } else if (animal instanceof Cat) {
            return "Meow!";
        } else {
            return "Unknown sound";
        }
    }
}