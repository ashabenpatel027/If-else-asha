import java.util.Scanner;

 class Salary {
   //
    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        // taking all the input to the employee
        int basic;
        String name;
        System.out.println("Enter the name of Employee");
        name = salary.next();
        System.out.println("Enter the id of Employee");
        int id = salary.nextInt();
        System.out.println("Enter the basic salary  of an employee");
        basic = salary.nextInt();
        // calculating all the parameters
        double da = basic * 8 / 100;
        System.out.println("da=" + basic * 8 / 100);
        double hra = basic * 10 / 100;
        System.out.println("hra=" + basic * 10 / 100);
        double pf = basic * 20 / 100;
        System.out.println("pf=" + basic * 20 / 100);
        double ta = basic * 9 / 100;
        double gp= basic+hra+ta+da-pf;
        System.out.println("gp="+ (basic + hra + ta + da));
        System.out.println("employee name=" + name);
        System.out.println("Gross salary=" + gp);
    }





    }
















