import java.util.Scanner;

public class AnyValue {
    // to check any value is number/ alphabet/symbol
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        char ch = scanner.next().charAt(0);


        System.out.println("Enter any character ");

        if  ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
        System.out.println(ch + "is a Alphabet");
    } else if (ch>='0'&& ch<='9'){
            System.out.println(ch +" is A DIGIT");

        } else  {
            System.out.println(ch+ " is A SPICAL CHARACTER");

        }

    }}

