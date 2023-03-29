import java.util.Scanner;

public class InterchangedValue {
    public static void main(String[] args) {
        int a,b,temp; //a=100 //b=200
        System.out.println("Enter two Numbers");
        Scanner r = new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before Interchange "+ a+" "+ b); //100 200
        temp =a;// temp=100
        a=b;    // a=200
        b=temp;//b=100
        System.out.println("After Interchange "+ a+" "+ b);  //200 100
    }
}

