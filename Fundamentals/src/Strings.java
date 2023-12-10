public class Strings {
  public static void main(String[] args) {
    // String Are Reference Types in Java So in Order to Create a String We Need To Create a String Object
    String message = new String("Hello World");
    System.out.println(message);

    // However, Since We Use Strings Often There is a Shorthand to Create a String in Java
    String message1 = "This is a Message";
    System.out.println(message1);

    // Checking if a String Ends With a Specific Character
    System.out.println(message1.endsWith("e")); // true

    // Checking if a String Starts With a Specific Character
    System.out.println(message1.startsWith("This")); // true

    // Checking The Length of a String 
    System.out.println(message1.length()); // 17

    // Checking The Index of a Specific Character
    System.out.println(message1.indexOf("s")); // 3

    // Replacing, replace() Method Returns A New Modified String, ie: The Original String is Not Affected
    System.out.println(message1.replace("This" , "Here")); // Here is a Message

    // To Lower Case
    System.out.println(message1.toLowerCase()); // this is a message

    // To Upper Case
    System.out.println(message1.toUpperCase()); // THIS IS A MESSAGE

    // Removing Unnecessary Spaces Using trim()
    System.out.println("  hello there    ".trim()); // "hello there"

    // String To Integer
    String num = "2";
    System.out.println(Integer.parseInt(num) + 2); // 4
  }
}
