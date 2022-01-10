import java.util.Scanner;

public class ConsonantVowel {

    public static void main (String args[])
    {
        Character c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Letter :");
        c=sc.next().charAt(0);

        if(c =='a'|| c =='e'|| c =='i'|| c =='o'|| c =='u')
        {
            System.out.println("It is a Vowel");
        }
        else
        {
            System.out.println("It is consonant");
        }

    }
}
