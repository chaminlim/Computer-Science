   //Name: Chamin Lim, Date: 12/21/18

   import javax.swing.*;
   import java.awt.*;
   @SuppressWarnings("serial")
    public class Display11 extends JPanel
   {
      private JLabel[] output;
      private int[] bits;
       public Display11()
      {
         setLayout(new GridLayout(1, 8));

         output = new JLabel[8];
         bits = new int[8];
         for(int x = 0; x <= 7; x++)
         {
            output[x] = new JLabel("", SwingConstants.CENTER);
            output[x].setFont(new Font("Serif", Font.BOLD, 50));
            add(output[x]);
         }
         setBlank();
      }
       public void setBlank()
      {
        // put 8 dashes in the JLabel
        for (int x = 0; x < output.length; x++) {
          output[x].setText("-");
        }
      }
       public void setValue( int num )
      {
        //convert the num to binary
        for (int x = bits.length-1; x >= 0; x--) {
          bits[x] = num%2;
          num = (num - num%2)/2;
        }
        //display the binary number in the JLabel
        for (int x = 0; x < output.length; x++) {
          output[x].setText(String.valueOf(bits[x]));
        }
      }
   }
