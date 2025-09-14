import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        int n=sc.nextInt();

        int c=n;
        int r,rev=0;
        
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }  

        System.out.println("Reverse of "+c+" is "+rev);

        if(rev==c)
        {
            System.out.println(c+" is a palindrome");
        }
        else
        {
            System.out.println(c+" is not a palindrome");
        }
    }
}
