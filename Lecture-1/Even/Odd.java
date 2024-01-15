import java.util.Scanner;
/**
 * Odd
 */
public class Odd {

    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            a=sc.nextInt();
            if(a%2==0)
            {
                System.out.println("The Number is Even:"+a);
            }
            else
            {
                System.out.println("The Number is odd:"+a);
            }
        }
        
    }
}