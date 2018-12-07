	//Name: Chamin Lim,   Date: 4/3/2018
    public class Driver05
   {
      public static final int TRIALS = 100;
       public static void main(String[] args)
      {
         Dice d = new Dice();
         // Experiment  1
         int count = 0;
         do
         {
            d.roll();
            count = count + 1;
         }while(d.total() != 12);
         System.out.println("It took " + count + " rolls to get boxcars.");
      
      	int count2 = 0;
			do{
				d.roll();
				count2 = count2 + 1;
			}while(d.doubles() == false);
			System.out.println("It took " + count2 + " rolls to get doubles: " + d.toString());
         
			int count3 = 0;
         int[] arr = new int[13];
			for(int x = 1; x <= TRIALS; x++){
				d.roll();
				int total = d.total();
				arr[total]++;
				if(d.doubles() == true)
					count3 = count3 + 1;
			}
			for(int a = 2; a <= 12; a++){
				System.out.println(a + "'s: " + arr[a]);
			}
			System.out.println("Number of doubles in 100 rolls: " + count3);
      }
   }
	/******
	 It took 35 rolls to get boxcars.
    It took 4 rolls to get doubles: {1, 1}
    2's:  6
    3's:  6
    4's:  5
    5's:  10
    6's:  12
    7's:  20
    8's:  17
    9's:  6
    10's:  10
    11's:  4
    12's:  4
    Number of doubles in 100 rolls: 18
	 ********/