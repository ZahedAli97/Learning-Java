import java.util.Scanner;

public class Q2 {
	public static String format(int number, int width) {
		String stringNumber = String.valueOf(number);
		if(stringNumber.length() >= width) {
			return stringNumber;
		}
		while(stringNumber.length() != width) {
			stringNumber = '0' + stringNumber;
		}
		return stringNumber;
	}
	public static void main(String[] args) {
		System.out.print("Enter the Number which you want to format : ");
		Scanner userInputNumber = new Scanner(System.in);
		int number = userInputNumber.nextInt();
		System.out.print("Enter the total width for the number to be formatted : ");
		Scanner userInputWidth = new Scanner(System.in);
		int width = userInputWidth.nextInt();
		System.out.printf("The formatted number is %s.",format(number,width));
	}
}
