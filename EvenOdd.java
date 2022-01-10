import java.util.*;
class EvenOdd{
    public static void main(String[] args) {
        int x;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value : ");
        x= sc.nextInt();
        if( x % 2 ==0 ) {
            System.out.println("It is a even number");
        }
            else
        {
            System.out.println("It is an odd number");

        }


    }
}