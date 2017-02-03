import java.io.*;
public class IAmInCenter
{
   public static void main(String args[])throws IOException
   {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    System.out.println("Enter the size:");
    int n=Integer.parseInt(br.readLine());
    int j;
    for(int i=0;i<n-1;i++)
    {
     for(j=n-1-i;j>0;j--)
      System.out.print(" ");
     for(j=(2*i)+1;j>0;j--)
      System.out.print("*");
     System.out.println(""); 
    }
    System.out.println("Ankit");
    for(int i=n-2;i>=0;i--)
    {
     for(j=n-1-i;j>0;j--)
      System.out.print(" ");
     for(j=(2*i)+1;j>0;j--)
      System.out.print("*");
     System.out.println(""); 
    }
}
}
