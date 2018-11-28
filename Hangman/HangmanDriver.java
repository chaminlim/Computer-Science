//Chamin Lim & Tony Jiang; Period 1
import javax.swing.JFrame;
public class HangmanDriver
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Hangman");
      frame.setSize(800,600);
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new HangmanPanel());
      frame.setVisible(true);
   }
}