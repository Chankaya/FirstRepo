import java.io.*;
public class FizzBuzz
{
 public static void main(String args[])
 {
   for(int i=1;i<=15;i++)
   {
       
    System.out.println((i%3==0)?((i%5==0)?"FizzBuzz":"Fizz"):((i%5==0)?"Buzz":""+i));
   }
 }
}