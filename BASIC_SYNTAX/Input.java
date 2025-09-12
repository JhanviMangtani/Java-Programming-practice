import java.util.*;


public class Input 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name : ");
        String s=sc.nextLine();

        System.out.println("Enter an integer : ");
        int a=sc.nextInt();

        System.out.println("Enter any decimal number : ");
        double d=sc.nextDouble();

        System.out.println("Name : "+ s);
        System.out.println("Integer : "+ a);
        System.out.println("Decimal number : "+d);

        sc.close();

    }
}
