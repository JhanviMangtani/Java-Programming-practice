import java.util.*;

public class CheckPrime 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        int a=sc.nextInt();

        boolean b=prime(a);
        if(b==true)
        {
            System.out.println(a+" is a prime number ");
        }
        else
        {
            System.out.println(a+" is not a prime number ");
        }
    }

    public static boolean prime(int n)
    {
        int i=2;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                break;
            }
        }
        if(i==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
