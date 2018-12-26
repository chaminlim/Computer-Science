   //Name: Chamin Lim Date: 12/21/18

   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   @SuppressWarnings("serial")
    public class Panel11 extends JPanel
   {
      private JTextField box;
      private JLabel label;
      private Display11 display;
      private JButton button2;
       public Panel11()
      {
         setLayout(new BorderLayout());

         /********************
      	a local panel, holding a label and a textField, is in the north.

      	a display is in the center.
      	*********************/
        JPanel north = new JPanel();

        north.setLayout(new FlowLayout());
        add(north, BorderLayout.NORTH);
        JLabel l = new JLabel("Enter an integer from 0 to 255:");
        box = new JTextField(4);
        north.add(l);
        north.add(box);
        display = new Display11();
        add(display, BorderLayout.CENTER);

         JPanel south = new JPanel();
         south.setLayout(new FlowLayout());
         add(south, BorderLayout.SOUTH);
         JButton button1 = new JButton("Convert");
         button1.addActionListener(new Listener1());
         south.add(button1);
         button2 = new JButton("Step");
         button2.addActionListener(new Listener2());
         south.add(button2);
         button2.setEnabled(false);
         label = new JLabel("");
         south.add(label);
      }
       private class Listener1 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            button2.setEnabled(false);
            int x;
            try
            {
               x = Integer.parseInt(box.getText());
            }
                catch(NumberFormatException f)
               {
                  label.setText("That's not a number!");
                  display.setBlank();
                  return;
               }
            if( x > 255 || x < 0 )
            {
               label.setText("Number must be from 0 to 255.");
               display.setBlank();
               return;
            }
            label.setText("");
            display.setValue(x);
            button2.setEnabled(true);
         }
      }
       private class Listener2 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            /******************
         	increment and display both numbers here
         	******************/
          box.setText(String.valueOf(Integer.parseInt(box.getText()) + 1));
          int x = Integer.parseInt(box.getText());
          display.setValue(x);
         }
      }
   }
