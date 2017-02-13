import java.io.*;
public class RightTriangle
{
 public static void main(String args[])throws IOException
 {
  int n,j;
   System.out.println("Enter the size:");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  n=Integer.parseInt(br.readLine());
  for(int i=1;i<=n;i++)
  {
   for(j=1;j<=i;j++)
    System.out.print("*");
    
   System.out.println();
  }
 }
}
