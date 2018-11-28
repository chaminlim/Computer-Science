//Chamin Lim 9/14/18
import java.util.Scanner;
public class Divide
{
   public static void main(String[] args)
   {
      System.out.println("Enter the first integer you want: ");
      Scanner scanner = new Scanner(System.in);
      int num1 = scanner.nextInt();
      System.out.println("Enter the second integer you want: ");
      int num2 = scanner.nextInt();
      if(num1 > num2)
         System.out.println("If you divide " + num1 + " and " + num2 + ", the answer is " + (num1 / num2) + " r " + (num1  % num2));
      else if(num1 == num2)
         System.out.println("If you divide " + num1 + " and " + num2 + ", the answer is 1 r 0");
      else
         System.out.println("If you divide " + num2 + " and " + num1 + ", the answer is " + (num2 / num1) + " r " + (num2  % num1));  
   }
}