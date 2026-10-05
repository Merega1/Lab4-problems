package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        final int SALESPEOPLE;
        System.out.println("Please enter the number of Salesperson: ");
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int maxSale = 0;
        int idMaxSale = 0;
        int minSale = Integer.MAX_VALUE;
        int idMinSale = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            if(sales[i] > maxSale) {
                maxSale = sales[i];
                idMaxSale = i + 1;
            }
            if(sales[i] < minSale){
                minSale = sales[i];
                idMinSale = i + 1;
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("The average sales: " + (float) (sum / SALESPEOPLE));
        System.out.println("Salesperson " + idMaxSale + " had the highest sale with $" + maxSale);
        System.out.println("Salesperson " + idMinSale + " had the lowest sale with $" + minSale);

        int enteredValue;
        System.out.println("Enter a value: ");
        enteredValue = scan.nextInt();
        int counter = 0;
        for(int i = 0; i < sales.length; i++){

            if(sales[i] > enteredValue) {
                System.out.println("Salesperson " + (i + 1) + " has a greater sale than the value you entered: " + enteredValue);
                counter++;
            }
        }
        System.out.println("The number of salesperson that has a greater sale than the entered value: " + counter);

    }
}