import java.io.*;
import java.util.*;

public class PrintEven
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number till which you want sequence : ");
        int n=sc.nextInt();

        System.out.println("The sequence is : ");
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                 System.out.println(i);
            } 
        }
    }
}

