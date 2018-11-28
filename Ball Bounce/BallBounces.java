import java.util.Scanner;
public class BallBounces {
	private static int times;
	private static double iniHeight, index, height, totHeight;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the initial height: ");
		iniHeight = scanner.nextInt();
		System.out.println("Please enter the index of ball's bouciness: ");
		index = scanner.nextDouble();
		System.out.println("Please enter the number of times the ball is allowed to continue bouncing: ");
		times = scanner.nextInt();
		
		for(int i = 1; i < times; i++) {
			height = iniHeight*index;
			totHeight = totHeight + iniHeight + height;
			iniHeight = height;
			if (height < 0.08333) {
				System.out.println("In bounce " + i + ", the ball height of bounced is negligible.");
				break;
			}
			System.out.println("After bounce " + i + ", the total distance ball had bounced is " + (int)(totHeight*12-(totHeight*12)%12)/12 + " feet and " + (int)(totHeight*12)%12 + " inches");
		}
	}

}
