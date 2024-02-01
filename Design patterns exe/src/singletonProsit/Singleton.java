package singletonProsit;

public class Singleton {
    // La seule instance possible de la classe
    private static Singleton instance;

    // Constructeur privé pour empêcher l'instanciation directe
    private Singleton() {}

    // Méthode pour obtenir l'instance unique
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Méthode de test
    public Object showMessage() {
        return "Je suis une instance unique de Singleton.";

    }

    public static void main(String[] args) {
        // Utilisation du singleton
        Singleton singletonInstance = Singleton.getInstance();
        singletonInstance.showMessage();
    }
}

