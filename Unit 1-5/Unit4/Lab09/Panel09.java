   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.14.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel09 extends JPanel
   {
      ScoreCard09 scorecard;
      JLabel output;
      public Panel09()
      {
         setLayout(new BorderLayout());
      
         output = new JLabel("------", SwingConstants.CENTER);
         add(output, BorderLayout.NORTH);
      
         scorecard = new ScoreCard09();
         add(scorecard, BorderLayout.CENTER);
      
         JPanel panel = new JPanel();
         panel.setLayout(new FlowLayout());
         addButton(panel, "Randomize", new Listener1());
         addButton(panel, "Total Score", new Listener2());
         addButton(panel, "Holes in One", new Listener3());
         addButton(panel, "Hardest Hole", new Listener4());
         add(panel, BorderLayout.SOUTH);
      }
      private void addButton(JPanel p, String s, ActionListener a)
      {
         JButton b = new JButton(s);
         b.addActionListener(a);
         p.add(b);
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            scorecard.randomize();
            output.setText("------");
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            output.setText("Total Score: " + scorecard.findTotal());
         }
      }
      private class Listener3 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            output.setText("Holes in One: " + scorecard.findAces());
         }
      }
      private class Listener4 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            output.setText("Hardest Hole: " + scorecard.findHardestHole());
         }
      }
   }