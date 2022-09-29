import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numOfPeople = scan.nextInt();
        System.out.print("What's the tip percentage (0 - 100): ");
        int tipPercentage = scan.nextInt();

        double price = 0;
        double totalBill = 0;

        while (price != -1.0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            price = scan.nextDouble();
            if (price != -1){
                totalBill += price;

            }

            scan.nextLine();

        }

        System.out.println("------------------------------");
        System.out.println("Total Bill Before Tip: " + (formatter.format(totalBill)));
        System.out.println("Tip Percentage: " + (formatter.format(tipPercentage)));
        System.out.println("Total Tip: " + (formatter.format(totalBill*tipPercentage/100)));
        System.out.println("Total Bill With Tip: " + (formatter.format(totalBill*tipPercentage/100 + totalBill)) );
        System.out.println("Per Person Cost Before Tip: " + (formatter.format(totalBill/numOfPeople)));
        System.out.println("Tip Per Person: " + (formatter.format(totalBill*tipPercentage/100/numOfPeople)));
        System.out.println("Total Cost Per Person: " + (formatter.format((totalBill*tipPercentage/100 + totalBill)/numOfPeople)));



    }

}
