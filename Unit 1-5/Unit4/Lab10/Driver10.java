   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.14.2003

   import javax.swing.JFrame;
   public class Driver10
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Unit4, Lab10: Binary Reversal");
         frame.setSize(500, 150);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new Panel10());
         frame.setVisible(true);
      }
   }
