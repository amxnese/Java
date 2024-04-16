import java.util.*;

public class DuplicateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        System.out.println("Enter the integers:");

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            checkForDuplicates(numbers);
            System.out.println("No duplicates found!");
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForDuplicates(int[] numbers) throws DuplicateNumberException {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                throw new DuplicateNumberException("Duplicate number found" + numbers[i]);
            }
        }
    }
}

class DuplicateNumberException extends Exception {
    DuplicateNumberException(String message){
        super(message);
    }
}
