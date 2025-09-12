import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypeConversion 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a= 10;
        double d=a;

        double x =9.58;
        int y=(int)x;

        System.out.println(d);
        System.out.println(y);
        
    }

}
