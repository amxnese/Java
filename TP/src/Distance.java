import java.lang.Math;

public class Distance {
    private int x;
    private int y;

    // Constructor
    public Distance(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate the distance between two points
    public double distanceCalculate(Distance Point) {
        int deltaX = Point.x - this.x;
        int deltaY = Point.y - this.y;

        // Calculate the Euclidean distance
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public static void main(String[] args) {
        // Example usage
        Distance point1 = new Distance(5, 6);
        Distance point2 = new Distance(3, 2);

        // Calculate and display the distance between the two points
        double distance = point1.distanceCalculate(point2);
        System.out.println("The distance between P1 and P2 is: " + distance);
    }
}

