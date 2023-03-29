import java.util.Scanner;

public class StudentPassOrFail {
    //student pass  if get more than 35 marks
  public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
        byte maths,eng,sci;
        float percentage;
        int total;
        System.out.println("Enter Maths Marks");
        maths =input.nextByte();
        System.out.println("Enter eng Marks");
        eng= input.nextByte();
        System.out.println("Enter sci Marks");
        sci =input.nextByte();
        percentage=(maths+eng+sci)/3.0f;
        System.out.println("your overall percentage is "+percentage);
      // to do percentage  logic here
if (percentage>=35 && maths>=35 & eng>=35 &&  sci>=35){
    System.out.println("Congratulation you are been pass");
}
else {
    System.out.println("Sorry you are been fail");
}if (percentage>=80){
          System.out.println("your grade is A+");
      } else if (percentage>=60) {
          System.out.println("your grade is A");

      } else if (percentage>=50){
          System.out.println("your grade is B");
      } else if (percentage>=35){
          System.out.println("your grade is c");
      }
  }}