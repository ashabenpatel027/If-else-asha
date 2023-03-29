import java.util.Scanner;

public class Symbol {
    // use the symbols
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First number");
        int a =scanner.nextInt();
        System.out.println("Enter the Second number");
        int b = scanner.nextInt();
        System.out.println("choose operator [1] - Addition -[2] - minus [3] - Multiplication [4] - division ");
        int ch= scanner.nextInt();
        // if else statements
        if (ch==1){
            System.out.println("Answer:"+(a+b));
        } else if (ch==2) {
            System.out.println("Answer:"+(a-b));

        } else if (ch==3) {
            System.out.println("Answer:"+(a*b));

        }else  if (ch==4){
            System.out.println("Answer:"+(a/b));
        }



    }
}
