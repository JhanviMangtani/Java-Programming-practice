import java.io.*;
import java.util.*;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter operation to performed(+,-,*,/) : ");
        String c=sc.nextLine();

        System.out.println("Enter first number : ");
        double a=sc.nextDouble();

        System.out.println("Enter second number : ");
        double b=sc.nextDouble();

        double d;

        switch(c)
        {
            case "+":
            d=a+b;
            System.out.println("Sum of the numbers is "+d);
            break;

            case "-":
            d=a-b;
            System.out.println("Difference of the numbers is "+d);
            break;

            case "*":
            d=a*b;
            System.out.println("Product of the numbers is "+d);
            break;

            case "/":
            if(b==0)
            {
                System.out.println("Division by zero is not possible.");
                break;
            }
            else
            {
                d=a/b;
                System.out.println("Result of division is : "+d);
                break;
            }
           
            default:
            System.out.println("Incorrect operator entered ");
        }

    }
}
