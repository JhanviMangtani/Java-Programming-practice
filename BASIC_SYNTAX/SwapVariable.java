import java.util.*;
import java.io.*;

public class SwapVariable 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=sc.nextInt();

        System.out.println("Enter second number : ");
        int b=sc.nextInt();

        a=a+b;                                                //int temp=a;
        b=a-b;      //<-without temp variable                 //a=b;        -->using temporary variable
        a=a-b;                                               //b=temp;

        System.out.println("First number is : \n"+a);
        System.out.println("Second number is : \n"+b);
    }
}
