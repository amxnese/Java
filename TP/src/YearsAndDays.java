public class YearsAndDays {
  /*
   * Challenge 01:
   * Write a method printYearsAndDays with parameter of type long named minutes.
   * 
   * The method should not return any value, and it needs to calculate the years
   * and days from the minutes parameter.
   * 
   * If the parameter is less than 0, print text "Invalid Value".
   * 
   * Otherwise, if the parameter is valid then it needs to print a message in the
   * format "XX min = YY years and ZZ days".
   * 
   * XX represents the original value minutes.
   * YY represents the calculated years.
   * ZZ represents the calculated days.
   * 
   * Example: 561600 min = 1 years and 25 days.
   * 
   */

  public static void printYearsAndDays(long minutes) {
  if (minutes < 0) {
      System.out.println("Invalid Value");
  } else {
      long minutesInYear = 60 * 24 * 365;
      long years = minutes / minutesInYear;
      long remainingMinutes = minutes % minutesInYear;
      long days = (int) (remainingMinutes / (60 * 24));
      System.out.println(minutes + " min = " + years + " years and " + days + " days.");
}
}
  public static void main(String[] args) {
    long mins = 2236235234l;
    printYearsAndDays(mins);
  }
}