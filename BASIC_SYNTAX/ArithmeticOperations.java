import java.util.Scanner;

public class ArithmeticOperations
 {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer : ");
        int a=sc.nextInt();

        System.out.println("Enter second integer : ");
        int b=sc.nextInt();

        System.out.println("Sum of the numbers is : \n"+(a+b)); 
        System.out.println("Difference of the numbers is : \n"+(a-b));
        System.out.println("Product of the numbers is : \n"+(a*b));
        System.out.println("Result of division of the numbers is : \n"+(a/b));
        System.out.println("Remainder of division of the numbers is : \n"+(a%b));

    }
}
