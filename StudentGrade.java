import java.util.Scanner;

public class StudentGrade {
    static Scanner scanner = new Scanner(System.in);
    //Variable to store name,roll number,marks,percentage and result


    public void score() {

        System.out.println("Enter Student  name");
        String name = scanner.next();


        System.out.println("Enter student roll");
        int roll = scanner.nextInt();

        System.out.println("Enter eng,maths,sci marks ");
        int eng = scanner.nextInt();
        int maths = scanner.nextInt();
        int sci = scanner.nextInt();
        System.out.println("eng+maths+sci");
       int  total = eng + maths + sci;
       float percentage=(total/3);
        System.out.println("your total marks="+(total));
        System.out.println(" your percentage " + percentage);

        System.out.println("total marks for" + total);
// if else method

        if (maths >= 35 && sci >= 35 && eng >= 35) {
            System.out.println(" you are pass");
        }else{
            System.out.println(" sorry you are fail");
        }

        if (percentage >= 80 && percentage<=100) {
            System.out.println("your grade is A+");

        } else if (percentage >= 60 && percentage<=79 ) {
            System.out.println("your grade is A");
        } else if (percentage >= 50 &&  percentage<=59) {
            System.out.println("your grade is B");

        } else if (percentage >= 35 && percentage<=49) {
            System.out.println("your grade is C");


        } else if (percentage<=35 ) {
            System.out.println("you are Fail");

        }else {
            System.out.println("please try again ");
        }
    }
    public static void main(String[] args) {
        StudentGrade studentGrade =new StudentGrade();
        studentGrade.score();
    }


}








