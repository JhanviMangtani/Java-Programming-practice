import java.util.Scanner;

public class FibonacciSeriesRecursion 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number till you want the fibonacci series : ");
        int a=sc.nextInt();

        System.out.println("The fibonacci series is : ");
        for(int i=1;i<=a;i++)
        {
            System.out.println(fib(i));
        }
        
    }

    public static int fib(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if (n==2) 
        {
           return 1; 
        }
        else
        {
            return fib(n - 1) + fib(n - 2);
        }

        
    }
}