import java.util.*;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year or not: ");
        int year = sc.nextInt();
        boolean isLeapYear = checkLeapYear(year);
        if(isLeapYear){
            System.out.println(year + " is a leap year!");
        }
        else{
            System.out.println(year + " is not a leap year!");
        }
    }

    static boolean checkLeapYear(int year){
        boolean isLeapyear;
        if(year % 4 == 0){
            if(year % 100 == 0){
                isLeapyear = year % 400 == 0;
            }
            isLeapyear = true;
        }
        else{
            isLeapyear = false;
        }
        return isLeapyear;
    }
}