//Chamin Lim & Tony Jiang; Period 1
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.lang.String;

public class HangmanPanel extends JPanel {
	// a private field
	private JLabel password, picLabel;
	private JTextField box;
	private String[] str = { "cranberry", "cookie", "honeybee", "gorilla",
			"jacket", "jupiter", "airplane", "hacker" };
	private String showWord, realWord;
	private String[] arr;
	private int num;

	public HangmanPanel() {
		setLayout(new BorderLayout());

		// Random word generated and showed as secret
		int random = (int) (Math.random() * 7);
		// Assign random word from str[] to showArray and realArray
		String phrase = str[random];
		num = phrase.length();
		arr = phrase.split("");
		for (int x = 1; x <= phrase.length(); x++) {
			System.out.println(arr[x]);
		}
		for (int i = 1; i <= phrase.length(); i++) {
			if (arr[i].equals(" "))
				arr[i] = " ";
			else
				arr[i] = " _";
		}
		String word = Arrays.toString(arr);
		word = word.replace(",", "");
		System.out.println(word);

		password = new JLabel(word);
		add(password, BorderLayout.CENTER);

		// User Input
		JPanel subpanel = new JPanel();
		subpanel.setLayout(new FlowLayout());
		add(subpanel, BorderLayout.SOUTH);
		// Box for users to put an alphabet they want
		box = new JTextField("", 5);
		subpanel.add(box);
		// Gets users input
		JButton button = new JButton("Enter");
		button.addActionListener(new Listener());
		subpanel.add(button);
	}

	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String input = box.getText();
			for (int i = 1; i <= num; i++) {
				if (arr[i].equals(input))
					arr[i] = input;
				else
					arr[i] = " _";
			}
			System.out.println(input);
			String temp = Arrays.toString(arr);
			temp = temp.replace(",", "");
			System.out.println(temp);
			password.setText(temp);
			;
		}
	}
}
