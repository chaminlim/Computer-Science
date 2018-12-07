	//Name: Chamin Lim,  Date: 4/3/2018
   public class Dice
   {
      private int myOne, myTwo;
      public Dice()
      {
         myOne = random();
         myTwo = random();
      }
      public void roll()
      {
         myOne = random();
         myTwo = random();
      }
      public int total()
      {
         return myOne + myTwo;
      }
      public boolean doubles()
      {
         if(myOne == myTwo)
				return true;
			else
				return false;
      }
      public String toString()
      {
         return "{" + myOne + ", " + myTwo + "}";
      }
      private int random()
      {
         return (int)(Math.random() * 6 + 1);
      }
   }