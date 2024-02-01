/* package singletonProsit;

import org.junit.Test;
import static org.junit.Assert.*;

public class Observer {

    @Test
    public void testObserverPattern() {
        // Création du sujet observable
        ConcreteSubject subject = new ConcreteSubject();

        // Création des observateurs
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        // Ajout des observateurs au sujet observable
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Le sujet observable effectue une action et notifie les observateurs
        subject.doSomething();

        // Vérifiez si les observateurs ont reçu la mise à jour correctement
        assertTrue(((ConcreteObserver) observer1).getUpdateMessage().contains("Something important happened!"));
        assertTrue(((ConcreteObserver) observer2).getUpdateMessage().contains("Something important happened!"));
    }
}

 */