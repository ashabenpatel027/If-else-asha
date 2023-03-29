import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
 // checking commission base on sales
        Scanner scanner = new Scanner(System.in);



            System.out.println(" Enter  seller  name");
            String name = scanner.next();

            System.out.println(" Enter sales Id");
            int id = scanner.nextInt();


            System.out.println(" Enter sales_amount");
            double sales_amount = scanner.nextDouble();

            if (sales_amount >= 50000.00) {
                System.out.println("The commission rate is 35%");
                System.out.println("the commission amount for " + sales_amount + " is" + sales_amount * 0.35);
            } else if (sales_amount >= 30000) {

                System.out.println("The commission rate is 20%");
                System.out.println("The commission amount for " + sales_amount + " is" + sales_amount * 0.20);
            } else if (sales_amount >= 20000.00) {
                System.out.println("The commission rate is 10%");
                System.out.println("The commission amount for " + sales_amount + " is" + sales_amount * 0.10);

            } else if (sales_amount >= 10000) {
                System.out.println("The commission rate is 5%");
                System.out.println("the commission amount for " + sales_amount + " is" + sales_amount * 0.05);

            } else {
                System.out.println("The commission rate is 2%");
                System.out.println("The commission amount for " + sales_amount + " is" + sales_amount * 0.02);
            }
        }}









