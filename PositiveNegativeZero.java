import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        // to check num.is positive,negative or Zero
        int num;
        Scanner positive=new Scanner(System.in);
        num= positive.nextInt();
 // IF  else substance
        if (num>0){
            System.out.println("positive");
        } else if (num<0) {
            System.out.println("negative");

        }else {
            System.out.println("zero");
        }
    }
}
