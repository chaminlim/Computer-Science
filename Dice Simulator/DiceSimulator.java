//Chamin Lim; 9/4/18
import java.util.Random;
public class DiceSimulator
{
   public static void main(String[] args)
   {
      Random generator = new Random();
      
      int dice1 = generator.nextInt(6) + 1;
      int dice2 = generator.nextInt(6) + 1;
      
      System.out.println("The first dice showed " + dice1);
      System.out.println("The second dice showed " + dice2);
      System.out.println("The sum of two numbers is " + (dice1 + dice2));
   }
}