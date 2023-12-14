import java.text.NumberFormat;
import java.util.Scanner;
public class Mortgage {
    public static void main(String[] args) {
        // Creating a Scanner Object
        Scanner scanner = new Scanner(System.in);
        
        // Declaring Varibles
        final byte  MONTHS_IN_YEAR = 12;
        final byte  PERCENT = 100;
        int principal, years, months;
        double interest, Mortgage, monthly_interest;
        String mortgageFormated;

        // Getting Inputs
        System.out.print("Enter Principal: ");
        principal = scanner.nextInt();
        while(principal < 1000 || principal > 1000000){
            System.out.print("Enter a Number Between 1000 and 1000000: ");
            principal = scanner.nextInt();
        }
        
        System.out.print("Enter Period: ");
        years = scanner.nextInt();
        while (years <= 0){
            System.out.println("Enter a Positive Number: ");
            years = scanner.nextInt();
        }

        System.out.print("Enter Annual Interest Rate: ");
        interest = scanner.nextFloat();
        
        while (interest < 1 || interest > 30){
            System.out.println("Enter a Number Between 1 and 30:  ");
            interest = scanner.nextFloat();
        }

        // Breaknig Down Some Concepts
        monthly_interest = interest / MONTHS_IN_YEAR / PERCENT;
        months = years * 12;

        // Applying The Mortgage Formula (Can be Found on Wikihow)
        Mortgage =  principal 
                    * monthly_interest*(Math.pow(monthly_interest + 1,months)) 
                    / ((Math.pow(1 + monthly_interest,months)) - 1);
        mortgageFormated = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage: " + mortgageFormated);
    }
}
