
import java.io.*;
public class AsteriskLine
{
    public static void main(String args[])throws IOException
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the no. of asterisk to be displayed in a line:");
     int n=Integer.parseInt(br.readLine());
     for (int i=n;i>0;i--)
     System.out.print("*");
    }
}
