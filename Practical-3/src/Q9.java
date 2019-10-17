import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		System.out.print("Enter the number of lines : ");
		Scanner userInput  = new Scanner(System.in);
		int userChoice = userInput.nextInt();
		int spaces = userChoice*2;
		if(userChoice<15 || userChoice>1) {
		for(int i=1;i<=userChoice;i++) {
			for(int j=0;j<spaces;j++) {
				System.out.printf(" ");
			}
			spaces-=2;
			for(int k=i;k>=1;k--) {
				System.out.printf("%d ",k);
			}
			for(int l=2;l<=i;l++) {
				System.out.printf("%d ",l);
			}
			System.out.printf("\n");
		}
		} else {
			System.out.println("Number of lines can't be greater than 15 or less than 1.");
		}
	}
}
