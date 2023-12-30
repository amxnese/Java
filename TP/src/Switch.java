import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    /*
         * Write a Java program that prompts the user to enter a grade (A, B, C, D, or F),
         * and then uses a switch statement to provide a description for the grade
         * A --> Excellent.
         * B --> Good.
         * C --> Satisfactor.
         * D --> Needs Improvments
         * F --> Fail
         */
        System.out.print("Enter your Grade ! ");
        Scanner scanner = new Scanner(System.in);
        char grade = Character.toUpperCase(scanner.next().charAt(0));
        scanner.close();
        switch (grade) {
            case 'A':
                System.out.println("Excellent.");
                break;
            case 'B':
                System.out.println("Good.");
                break;
            case 'C':
                System.out.println("Satisfactor.");
                break;
            case 'D':
                System.out.println("Needs Improvments.");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
  }
}
