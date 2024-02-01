package singletonProsit;

import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        // Obtenir l'instance unique du Singleton
        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();

        // Vérifier si les deux instances sont identiques
        assertSame("Les deux instances devraient être identiques", singletonInstance1, singletonInstance2);
    }

    @Test
    public void testSingletonMessage() {
        // Obtenir l'instance unique du Singleton
        Singleton singletonInstance = Singleton.getInstance();

        // Utiliser l'instance pour afficher un message et vérifier la sortie
        assertEquals(singletonInstance.showMessage(), "Je suis une instance unique de Singleton.");
    }
}