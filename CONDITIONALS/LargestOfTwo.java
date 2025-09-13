import java.util.*;
import java.io.*;

public class LargestOfTwo
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a=sc.nextInt();

        System.out.println("Enter second number : ");
        int b=sc.nextInt();

        if(a>b)
        {
            System.out.println(a+" is larger than "+ b);
        }
        else if(b>a)
        {
            System.out.println(b+" is larger than "+ a);
        }
        else
        {
            System.out.println("Both the numbers are equal.");
        }

    }
    
 }
