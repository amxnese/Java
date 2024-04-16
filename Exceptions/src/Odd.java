class Odd {
    // Method to check if a number is odd and throw an exception if it is
    static void checkIfEven(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd: " + num);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Example number (odd)
        
        try {
            // Call the method that checks if the number is odd
            checkIfEven(number);
            System.out.println("Number is even.");
        } catch (OddNumberException e) {
            // Catch and handle the exception
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}

// Custom exception class for odd numbers
class OddNumberException extends Exception {
    OddNumberException(String message) {
        super(message);
    }
}
