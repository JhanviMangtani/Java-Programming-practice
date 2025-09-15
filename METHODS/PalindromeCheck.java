import java.util.*;

public class PalindromeCheck 
{
   public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        int a=sc.nextInt();

        boolean b=pal(a);
        if(b==true)
        {
            System.out.println(a+" is a plaindrome .");
        }
        else
        {
            System.out.println(a+" is not a plaindrome ."); 
        }


    } 

    public static boolean pal(int n)
    {
        int x=n;
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        if(x==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
