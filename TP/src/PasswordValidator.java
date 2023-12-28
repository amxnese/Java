import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password!");
        } else {
            System.out.println("Invalid Password!");
        }
    }

    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }

    public static boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        char[] arr = password.toCharArray();
        for (char ch : arr) {
            if (!isLetter(ch) && !isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
