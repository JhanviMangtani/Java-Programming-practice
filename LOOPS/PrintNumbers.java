import java.io.*;
import java.util.*;

public class PrintNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number till which you want sequence : ");
        int n=sc.nextInt();

        System.out.println("The sequence is : ");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}

