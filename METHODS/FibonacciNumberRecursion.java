import java.util.Scanner;

public class FibonacciNumberRecursion 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter postion of the number you want from the fibonacci series : ");
        int a=sc.nextInt();

        int b=fib(a);
        System.out.println("Fibonacci number is "+b);
        
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
