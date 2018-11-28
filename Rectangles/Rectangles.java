import java.io.*;
public class Rectangles {
	public static void main(String[] args) throws Exception{
		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		System.out.println("Width\tLength\tPerimeter\tArea");
		for (int w = 1; w <= 10; w++) {
			for (int l = 1; l <= 10; l++) {
				System.out.println(w + "\t" + l + "\t" + 2*(w+l) + "\t\t" + w*l);
			}
		}
	}
}
