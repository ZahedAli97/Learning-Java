import java.util.Scanner;

public class Q3 {
	public static void arrayReverser(int[] userArray) {
		for(int i=userArray.length-1; i>=0; i--) {
			System.out.print(userArray[i]+" ");
		}
		System.out.printf("\n");
	}
	public static void main(String[] args) {
		int numbers[] = new int[10];
		for(int i=0; i<10;i++) {
			System.out.printf("Enter the list of numbers to be reversed : ");
			Scanner userInput = new Scanner(System.in);
			numbers[i] = userInput.nextInt();
		}
		arrayReverser(numbers);
	}
}
