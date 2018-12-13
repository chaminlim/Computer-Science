	//Name: Chamin Lim, Date: 12/13/18
   import javax.swing.*;
   import java.awt.*;
   public class ScoreCard09 extends JPanel
   {
      private JTextField[] input;
      public ScoreCard09()
      {
         setLayout(new GridLayout(2, 18));

         for(int x = 1; x <= 18; x++)
         {
            add(new JLabel("" + x, SwingConstants.CENTER));
         }

         input = new JTextField[18];
         for(int x = 0; x < input.length; x++)
         {
            input[x] = new JTextField();
            add(input[x]);
         }
      }
      public void randomize()
      {
        for(int x = 0; x < input.length; x++){
          input[x].setText("" + (int)(Math.random()*4+1));
        }
      }
      public int findTotal()
      {
        int sum = 0;
        for(int x = 0; x < input.length; x++){
          sum = sum + Integer.parseInt(input[x].getText());
        }
        return sum;
      }
      public int findAces()
      {
        int count = 0;
        for(int x = 0; x < input.length; x++){
          if(input[x].getText().equals("1"))
            count++;
        }
        return count;
      }
      public int findHardestHole()
      {
        int max = 0;
        for(int x = 0; x < input.length; x++){
          max = Math.max(max, Integer.parseInt(input[x].getText()));
        }
        int a = 0;
        for(int x = 0; x < input.length; x++){
          if(max == Integer.parseInt(input[x].getText())){
            a = x;
            break;
          }
        }
        return a+1;
      }
   }
