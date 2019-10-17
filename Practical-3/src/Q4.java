import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {
		float triangleHeight = 5, triangleWidth = 10;
		System.out.print("Enter a point with two coordinates : ");
		Scanner userInput = new Scanner(System.in);
		float inputHeight = userInput.nextFloat();
		float inputWidth = userInput.nextFloat();
		if((inputHeight<=triangleHeight/2)&&(inputWidth<=triangleWidth/2)) {
			System.out.printf("Point (%.1f,%.1f) is in the Rectangle.",inputHeight,inputWidth);
		} else {
			System.out.printf("Point (%.1f,%.1f) is not in the Rectangle.",inputHeight,inputWidth);
		}
	}
	
}
