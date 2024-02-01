package singletonProsit;




class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Red Color");
    }
}

class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Green Color");
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Draw Circle in ");
        color.applyColor();
    }
}

class Square implements Shape {
    private Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Draw Square in ");
        color.applyColor();
    }
}

public class Bridge {
    public static void main(String[] args) {
        // Utilisation du Bridge pour dessiner un cercle rouge
        Shape redCircle = new Circle(new RedColor());
        redCircle.draw();

        // Utilisation du Bridge pour dessiner un carré vert
        Shape greenSquare = new Square(new GreenColor());
        greenSquare.draw();
    }
}