
//Name: Chamin Lim, Date: 12/19/18
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Display10 extends JPanel {
  private JLabel[] bits;
  private JLabel label;

  public Display10() {
    setLayout(new GridLayout(1, 8));
    bits = new JLabel[8];
    for (int x = 0; x < bits.length; x++) {
      bits[x] = new JLabel("", SwingConstants.CENTER);
      bits[x].setFont(new Font("Serif", Font.BOLD, 50));
      add(bits[x]);
    }
    randomize();
    label = new JLabel("", SwingConstants.CENTER);
    add(label);
  }

  public void randomize() {
    for (int x = 0; x < bits.length; x++) {
      bits[x].setText(String.valueOf((int) (Math.random() * 2)));
    }
  }

  public void reverse() {
    int[] temp = new int[8];
    for (int x = 0; x < temp.length; x++) {
      temp[x] = Integer.parseInt(String.valueOf(bits[x].getText()));
    }
    for (int x = 0; x < bits.length; x++) {
      bits[x].setText(String.valueOf(temp[7 - x]));
    }
  }

  public void shift() {
    bits[0].setText(bits[1].getText());
    bits[1].setText(bits[2].getText());
    bits[2].setText(bits[3].getText());
    bits[3].setText(bits[4].getText());
    bits[4].setText(bits[5].getText());
    bits[5].setText(bits[6].getText());
    bits[6].setText(bits[7].getText());
    bits[7].setText("0");
  }

  public void rotate() {
    bits[0].setText(bits[1].getText());
    bits[1].setText(bits[2].getText());
    bits[2].setText(bits[3].getText());
    bits[3].setText(bits[4].getText());
    bits[4].setText(bits[5].getText());
    bits[5].setText(bits[6].getText());
    bits[6].setText(bits[7].getText());
    bits[7].setText(bits[0].getText());
  }

  public void convert() {
    double number = 0;
    int m = 128;
    for (int x = 0; x < bits.length; x++) {
      number = number + Integer.parseInt(bits[x].getText()) * m;
      m = m / 2;
    }
    label.setText("" + number);
  }
}
