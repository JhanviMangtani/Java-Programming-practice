import java.util.Scanner;

public class NaturalNumbersSum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number till which you want the sum of natural numbers : ");
        int a=sc.nextInt();

        int b=num(a);
        System.out.println("The sum is : "+b);

    }

    public static int num(int n)
    {
        return (n*(n + 1))/2;
    }
    
}
