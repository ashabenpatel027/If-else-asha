import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args)
            //century(100%=0 and 100%=0)
    {
        int year;
        System.out.println("Enter any year");
        Scanner r = new Scanner(System.in);
        year = r.nextInt();
        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

    }}





