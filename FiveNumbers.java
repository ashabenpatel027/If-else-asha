import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        //making input
        Scanner in=new Scanner(System.in);
        System.out.println("input first number");
        int num1= in.nextInt();
        System.out.println("input second number");
        int num2 = in.nextInt();
        System.out.println("input third number");
        int num3 = in.nextInt();
        System.out.println("input forth  number");
        int num4 = in.nextInt();
        System.out.println("input fifth number");
        int num5 = in.nextInt();
        System.out.println("Average of five number is:"+(num1+num2+num3+num4+num5));
    }
}
