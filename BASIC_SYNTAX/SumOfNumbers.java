import java.util.*;
import java.io.*;

public class SumOfNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer : ");
        int a=sc.nextInt();

        System.out.println("Enter second integer : ");
        int b=sc.nextInt();

        int s=a+b;
        System.out.println("Sum of the numbers is : \n"+s);

    }
    
}
