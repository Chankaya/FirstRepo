import java.io.*;
import java.lang.Math;
import java.util.*;
class PrimeFactors
{
   
    public static ArrayList<Integer> primeFactors(int n)
    {
        int c=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        while (n%2==0)
        {if(c==0)
            a.add(2);
            n /= 2;
            c++;
        }
 
        
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            c=0;
            while (n%i == 0)
            {
               if(c==0)
                a.add(i);
                n /= i;
                c++;
            }
        }
 
       
        if (n > 2)
          a.add(n);
        return a;
    }
 
    public static void main (String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number whose prime factors are to be found:");
        int n=Integer.parseInt(br.readLine());
        System.out.println(primeFactors(n));
    }
}