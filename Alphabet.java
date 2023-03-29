import java.util.Scanner;

public class Alphabet {
    // input  a to z --->  Uppeercase
    // input A TO Z  -----> Lowercase
    public static void main(String[] args) {
        char ch,ch2;
        System.out.println("Enter any character");
        Scanner r = new Scanner(System.in);
        ch= r.next().charAt(0); //ch =a
        if(ch>='A' && ch<='Z') // a>=A && a<=Z
        {
           ch2= Character.toLowerCase(ch);
            System.out.println("Lowercase "+ ch2);
        }else {
            ch2= Character.toUpperCase(ch);// a -- A
            System.out.println("Uppercase "+ ch2);
        }
    }

        {
}}
