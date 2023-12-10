import java.util.Date;
import java.awt.*;
public class Types {
  public static void main(String[] args){
    // Primitive Types
  byte age = 24;
  int views = 123_456_789;
  long distance = 3230000000L; // we add L after the number so the compiler treats it as a long
  float number = 25.23f; // we add f after the number so the compiler consider it as a float
  final double PI = 3.141592653589793; // final Indicates to Constant

  // Primitive Types are Copied By Values Hence They are independant
  byte x = 1;
  byte y = x;
  x = 2;
  System.out.println(y); // 1
  
  // Reference Types
  Date now = new Date();
  System.out.println(now);

  // Reference Types Are Copied By Reference Hence They are Dependant
  Point point1 = new Point(1,4); // now point1 is holding the reference that points to Point(1,4)
  Point point2 = point1; // in This Case point1 and point2 are Referencing the Same Point Object
  point2.x = 2; // ==> point2.x = 2 and point1.x = 2
  System.out.println(point1.x); // 2

  }
}
