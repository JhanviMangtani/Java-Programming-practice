import java.util.*;
import java.io.*;

public class CountDigits
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n=sc.nextInt();

        int a=n;
        int r,count=0;
        
        while(n>0)
        {
            r=n%10;
            count+=1;
            n=n/10;
        }
        System.out.println("The  number of digits in "+a+" are "+count);
    }
}