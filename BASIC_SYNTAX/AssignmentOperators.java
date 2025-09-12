import java.util.Scanner;

public class AssignmentOperators 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer : ");
        int a = sc.nextInt();

        System.out.println("Integer : " + a);

        a += 5;
        System.out.println("Updated value of a : " + a);
        a -= 2;
        System.out.println("Updated value of a : " + a);
        a *= 3;
        System.out.println("Updated value of a : " + a);
        a /= 2;
        System.out.println("Updated value of a : " + a);

    }
}
