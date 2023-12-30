import java.util.Random;
public class Rand {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(100); // generate a random integer number
            System.out.println("the element " + (i + 1) + " = " + numbers[i]);
            sum += numbers[i];
        }
        System.out.println("The sum of the array is : " + sum);
    }
}
