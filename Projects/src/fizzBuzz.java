/*  
    if Number is Divisible by 5 we Get Fizz , if Number is Divisible by 3
    We Get Buzz, if Number is Divisible by Both 3 and 5 we Get fizzBuzz,
    else return The Same Number
*/
import java.util.Scanner;
public class fizzBuzz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int number = scanner.nextInt();
    if(number % 5 == 0 && number %3 == 0)
      System.out.println("fizzBuzz");
    else if(number % 5 == 0)
      System.out.println("Fizz");
    else if(number % 3 == 0)
      System.out.println("Buzz");
    else
      System.out.println(number);
  }
}
