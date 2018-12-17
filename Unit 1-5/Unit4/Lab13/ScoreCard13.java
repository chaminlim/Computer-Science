   //Name: Chamin Lim, Date: 12/13/18
   import javax.swing.*;
   import java.awt.*;
   public class ScoreCard13 extends JPanel
   {
      private JTextField[][] input;
      public ScoreCard13()
      {
         setLayout(new GridLayout(5, 18));

         for(int hole = 1; hole <= 18; hole++)
         {
            add(new JLabel("" + hole, SwingConstants.CENTER));
         }

         input = new JTextField[4][18];
         for(int r = 0; r < input.length; r++)
            for(int c = 0; c < input[0].length; c++)
            {
               input[r][c] = new JTextField();
               add(input[r][c]);
            }
      }
      public void randomize()
      {
        for(int r = 0; r < input.length; r++){
          for(int c = 0; c < input[0].length; c++){
            input[r][c].setText("" + (int)(Math.random()*4+1));
          }
        }
      }
      public int findTotal(int r)
      {
        int sum = 0;
        for(int c = 0; c < input[0].length; c++){
          sum = sum + Integer.parseInt(input[r][c].getText());
        }
        return sum;
      }
      public int findAces(int r)
      {
        int count = 0;
        for(int c = 0; c < input[0].length; c++){
          if(input[r][c].getText().equals("1"))
            count++;
        }
        return count;
      }
      public int findHardestHole(int r)
      {
        int max = Integer.MIN_VALUE;
        for(int c = 0; c < input[0].length; c++){
          max = Math.max(max, Integer.parseInt(input[r][c].getText()));
        }
        int a = 0;
        for(int c = 0; c < input[0].length; c++){
          if(max == Integer.parseInt(input[r][c].getText())){
            a = c;
            break;
          }
        }
        return a+1;
      }
      public int findHardestHole()
      {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int hard = 0;
        for (int c = 0; c < input[0].length; c++) {
          for(int r = 0; r < input.length; r++){
            sum = sum + Integer.parseInt(input[r][c].getText());
            max = Math.max(max, sum);
          }
          sum = 0;
        }
        int add = 0;
        for (int c = 0; c < input[0].length; c++) {
          for(int r = 0; r < input.length; r++){
            add = add + Integer.parseInt(input[r][c].getText());
            if(add == max){
              hard = c;
              break;
            }
          }
          add = 0;
        }
        return hard + 1;
      }
   }
