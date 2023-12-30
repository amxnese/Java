public class GCD {

  /*
     * 
     * Write a method named getGreatestCommonDivisor with two parameters of type int
     * named first and second.
     * 
     * If one of the parameters is < 10, the method should return -1 to indicate an
     * invalid value.
     * 
     * The method should return the greatest common divisor of the two numbers
     * (int).
     * 
     * The greatest common divisor is the largest positive integer that can fully
     * divide each of the integers
     * (i.e., without leaving a remainder).
     * 
     * For example, 12 and 30:
     * 12 can be divided by 1, 2, 3, 4, 6, 12.
     * 30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30.
     * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
     * and there is no resulting remainder.
     * 
     */

    public static int getGreatestCommonDivisor(int num1, int num2) {
      if (num1 < 10 || num2 < 10) {
          return -1;
      }
      if (num2 > num1) {
          int temp = num2;
          num2 = num1;
          num1 = temp;
      }
      while (num2 != 0) {
          int temp = num2;
          num2 = num1 % num2;
          num1 = temp;
      }

      return num1;
  }

  public static void main(String[] args) {
    int num1 = 20;
    int num2 = 25;
    int result = getGreatestCommonDivisor(num1, num2);
    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result); // 5
  }
}
