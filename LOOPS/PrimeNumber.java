import java.util.*;

public class PrimeNumber
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n=sc.nextInt();

        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println(n+" is not a prime number ");
                break;
            }
        }
        if(i==n)
            {
                System.out.println(n+" is a prime number ");
            }
    }
}
