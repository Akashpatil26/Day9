import java.util.Scanner;

public class EmplyoeeWageUC8 {
    public static void main(String[] args) {
        int hours,wage,days,monthlywage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Emplyoee Wage ");
        System.out.println("Enter daily working hours: ");
        hours = sc.nextInt();
        System.out.println("Enter wage per hour: ");
        wage =sc.nextInt();
        System.out.println("Enter number of working days ");
        days= sc.nextInt();
        monthlywage = emplyoeeWage(hours,wage,days);
        System.out.println("Facebook monthly wage is :"+monthlywage);
    }
    public static int emplyoeeWage(int hours,int wage,int days) {
        int dailyWage = hours*wage;
        int faceBookwage = dailyWage*days;
        return faceBookwage;





    }
}



