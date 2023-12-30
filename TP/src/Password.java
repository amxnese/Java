import java.util.Scanner;

public class Password {
  public static boolean is_Valid_Password(String password) {
    final int max_length = 8;
    if (password.length() < max_length) return false;
    for (int i = 0; i < password.length(); i++) {
      char ch = password.charAt(i);
      if (!(is_digit(ch)) && !(is_Letter(ch))){
        return false;
      }
    }
    return true;
  }
    
    public static boolean is_Letter(char ch) {
    ch = Character.toUpperCase(ch);
    return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_digit(char ch) {
      return (ch>= '0' && ch <= '9');
    }

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("1. A password must have at least eight characters.\n" +
"2. A password consists of only letters and digits.\n" +
"Input a password (You are agreeing to the above Terms and Conditions.): ");
String s = input.nextLine();
input.close();
if (is_Valid_Password(s)) {
System.out.println("Password is valid: " + s);
} else {
System.out.println("Not a valid password: " + s);
}

}
}
