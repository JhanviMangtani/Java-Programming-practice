import java.util.*;
import java.io.*;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number till which you want fibonacci series : ");
        int n=sc.nextInt();

        int t1=0,t2=1,next;

        System.out.println("The fibonacci series is : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(t1);
            next=t1+t2;
            t1=t2;
            t2=next;
            
        }
    }
}
