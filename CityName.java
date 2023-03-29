import java.util.Scanner;

public class CityName {
    public static void main(String[] args){
        // USE MANI METHOD
     Scanner scanner =new Scanner(System.in);

        System.out.println("Please enter any alphabet A to F");
         char alphabet = scanner.next().charAt(0);
         // using if else

        if (alphabet=='A')
        {
            System.out.println("Ahmedabad");
        } else if (alphabet=='B'){
            System.out.println("Banaras");
        } else if (alphabet=='C') {
            System.out.println("Chandigadh");
        } else if (alphabet=='D') {
            System.out.println("Dhagadhra");
        } else if (alphabet=='E') {
            System.out.println("Elhabad");
        } else if (alphabet=='F') {
            System.out.println("Fatehpur");

        }else {
            System.out.println(" Invalid entry");
        }


    }}