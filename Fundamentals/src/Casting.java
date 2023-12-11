public class Casting {
  public static void main(String[] args) {
    // Implicit Casting  (Automatic Casting)
    // Implicit Casting Happens When There's No Chance of Losing Data
    // byte > short > int > long > float > double 
    short x = 2;
    int y = x + 1; // Now The Value of x is Copied in a Random int Before The Addition Takes Action

    double z = 2.2;
    double t = z + 2; // Now The of 2 is Copied in a Random Double so it Be 2.0 Before Addition

    // Explicit Casting (Manual Casting)
    int a = (int)z + 4; // 6
  }
}
