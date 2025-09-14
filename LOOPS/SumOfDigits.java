import java.util.*;
import java.io.*;

public class SumOfDigits
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n=sc.nextInt();

        int a=n;
        int r,sum=0;
        
        while(n>0)
        {
            r=n%10;
            sum+=r;
            n=n/10;
        }
        
        System.out.println("Sum of the digits of "+a+" is "+sum);
    }
}