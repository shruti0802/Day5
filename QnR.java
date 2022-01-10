import java.util.Scanner;

public class QnR {
    public static void main (String args[])

    {
        int Quotient, Divident;
        int Remainder, Divisor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divident");
        Divident = sc.nextInt();
        System.out.println("Enter divisor:");
        Divisor = sc.nextInt();
        Quotient=Divident / Divisor;
        Remainder=Divident % Divisor;
        System.out.println("The value of Quotient is: " +Quotient);
        System.out.println("The value of Remainder is: " +Remainder);
    }

}
