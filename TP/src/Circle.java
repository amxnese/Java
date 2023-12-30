import java.lang.Math;
public class Circle {
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the surface of the circle
    public double getSurface() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the perimeter of the circle
    public double getPerimetre() {
        return 2 * Math.PI * radius;
    }

    // Method to set the radius of the circle
    public void setRayon(double nR) {
        this.radius = nR;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(25);

        // Display information for each circle
        System.out.println("Circle 1 - Radius: " + circle1.radius);
        System.out.println("Surface: " + circle1.getSurface());
        System.out.println("Perimeter: " + circle1.getPerimetre());

        circle1.setRayon(100);

        // Display updated information for circle2
        System.out.println("\nAfter changing radius of Circle1:");
        System.out.println("Circle 2 - Radius: " + circle1.radius);
        System.out.println("Surface: " + circle1.getSurface());
        System.out.println("Perimeter: " + circle1.getPerimetre());
    }
}

