import java.io.*;
import java.util.*;
import java.lang.*;

public class RelationalOperator
 {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number : ");
        int a =Integer.parseInt(br.readLine());

        System.out.println("Enter second number : ");
        int b =Integer.parseInt(br.readLine());

        
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>b && a!=b);
        System.out.println(a>b || a!=b);

    }
}
