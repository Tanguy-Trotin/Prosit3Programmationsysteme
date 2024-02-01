package singletonProsit;

import java.util.ArrayList;
import java.util.List;

// Interface pour les observateurs
public interface Observer {
    void update(String message);

}

// Interface pour le sujet observable
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}

// Implémentation concrète du sujet observable
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Méthode spécifique du sujet observable
    public void doSomething() {
        // Fait quelque chose d'important
        // ...
        // Envoie une notification aux observateurs
        notifyObservers("Something important happened!");
    }
}

// Implémentation concrète de l'observateur
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received the update: " + message);
    }
}