public class Point1 {
    private char name;
    private double abscissa;

    // Constructor
    public Point1(char name, double abscissa) {
        this.name = name;
        this.abscissa = abscissa;
    }

    // Method to display the characteristics of the point
    public void display() {
        System.out.println("Point " + name + ": Abscissa = " + abscissa);
    }

    // Method to perform a translation
    public void translate(double translationValue) {
        abscissa += translationValue;
    }

    public static void main(String[] args) {
        // Create a point
        Point1 point1 = new Point1('A', 3.5);

        // Display characteristics before translation
        System.out.println("Before Translation:");
        point1.display();

        // Translate the point;
        point1.translate(2);

        // Display characteristics after translation
        System.out.println("\nAfter Translation:");
        point1.display();
    }
}

