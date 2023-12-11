import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("name:  ");
    String name = scanner.next();
    System.out.print("age: ");
    int age = scanner.nextInt();
    System.out.println("Hello " + name + " You are " + age + " yo");
  }
}
