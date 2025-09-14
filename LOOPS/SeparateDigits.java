import java.util.*;
import java.io.*;

public class SeparateDigits
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n=sc.nextInt();

        int r;
        System.out.println("The digits of "+n+" in reverse order are : ");
        while(n>0)
        {
            r=n%10;
            System.out.println(r);
            n=n/10;
        }
        
    }
}