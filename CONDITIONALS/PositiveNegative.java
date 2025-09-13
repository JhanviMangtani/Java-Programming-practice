

import java.util.Scanner;

public class PositiveNegative 
{
    public static void main(String[] args)
    {
      Scanner sc =new Scanner(System.in) ;

      System.out.println("Enter a number : ");
      int a=sc.nextInt();

      if(a>0)
      {
        System.out.println(a+" is a positive number .");
      }
      else if (a<0)
      {
        System.out.println(a+" is a negative number .");
      }
      else
      {
        System.out.println("The number is zero .");
      }

      sc.close();
    }
}

