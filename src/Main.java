import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        String numOfPeople = scan.nextLine();
        System.out.print("What's the tip percentage (0 - 100): ");
        int tipPercentage = scan.nextInt();

        double price = 0;
        double totalBill = 0;

        while (price != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            price = scan.nextDouble();
            if (price != -1);
            totalBill += price;

        }

        System.out.println("------------------------------");
        System.out.println("Total Bill Before Tip: ");



    }

}
