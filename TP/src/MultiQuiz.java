import java.util.Scanner;
public class MultiQuiz {
  public static void main(String[] args) {
  String name;
  int num = 0;
  // Prompt the candidate to enter their name and a number
  Scanner sc = new Scanner(System.in);
  System.out.println("\nEnter your name: ");
  name = sc.next();
  System.out.println("\nEnter the quiz number: ");
  num = sc.nextInt();
  sc.close();
  Quiz Q = new Quiz(name, num);
  Q.calculScore();
  }
}
class Quiz{
  String name;
  int num;

  Quiz(String name, int num){
    this.name = name;
    this.num = num;
  }

  void calculScore(){
    Scanner scanner = new Scanner(System.in);
    int score = 0;
    int input;
    for(int i = 1; i <= 10; i++){
      System.out.print(i + " * " + num + " = ");
      input = scanner.nextInt();
      if(input == i * num){
        System.out.println("Correct !");
        score++;
      }
      else{
        System.out.println("False !");
      }
    }
    scanner.close();
    System.out.println(name + " ! Your Score is " + score + "/10");
  }

}