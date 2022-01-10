import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        System.out.println("Enter third number: ");
        c=sc.nextInt();
        if(a>=b && a>=c)
            System.out.println("First value is greater " +a);
            else if(b>=a && b>=c)
                System.out.println("Second value is greater " +b);
        else
            System.out.println("Third value is greater " + c);
    }
}
