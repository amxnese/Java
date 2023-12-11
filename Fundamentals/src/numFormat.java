import java.text.NumberFormat;
public class numFormat {
  public static void main(String[] args) {
    // Creating a Currency Instance
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(123456.745);
    System.out.println(result); // $123,456.74

    NumberFormat percent = NumberFormat.getPercentInstance();
    String per = percent.format(0.3); 
    System.out.println(per); // 30%
  }
}
