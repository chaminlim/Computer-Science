//Chamin Lim; 9/4/18
public class LotteryPrinter
{
   public static void main(String[] args)
   {
      int[] array = new int[5];
      System.out.print("Play this combination [");;
      for(int i = 0; i <= 4; i++){
         int x = (int)(Math.random()*56 + 1);
         if(!(x == array[i]))
            array[i] = x;
         System.out.print(" " + array[i]);
      }
      int y = (int)(Math.random()*46 + 1);
      System.out.print(" ]" + "[" + y + "]" + ", it will make you prosperous");
   }
}