import java.util.Scanner;
public class Matrix {
    // Attributes
    private int[][] tab = new int[2][3];

    // Method to read values into the tab array from the user
    public void readMat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the 2x3 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                tab[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    // Method to print the elements of the tab array
    public void writeMat(){
        System.out.println("Matrix elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }

    // Method to calculate and return the sum of all elements in the tab array
    public int sumMat() {
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum += tab[i][j];
            }
        }
        return sum;
    }

    // Method to find and return the maximum value in the tab array
    public int maxMat() {
        int max = tab[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (tab[i][j] > max) {
                    max = tab[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Matrix matrix = new Matrix();

        // Read values into the matrix
        matrix.readMat();

        // Display the matrix
        matrix.writeMat();

        // Calculate and display the sum of matrix elements
        int sum = matrix.sumMat();
        System.out.println("Sum of matrix elements: " + sum);

        // Find and display the maximum value in the matrix
        int max = matrix.maxMat();
        System.out.println("Maximum value in the matrix: " + max);
    }
}
