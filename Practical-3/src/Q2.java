import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		int numberOfDays;
		System.out.print("Enter any month and year: ");
		Scanner userInput =  new Scanner(System.in);
		int month = userInput.nextInt(); //Separating integers on one line
		int year = userInput.nextInt();
		switch(month) {
		// case's without break serve the same result
		case 4:
		case 6:
		case 9:
		case 11:
			numberOfDays = 30;
			break;
		case 2:
			numberOfDays = 28;
			if(year%400==0) {
				numberOfDays = 29;
			}
			if(year%100==0) {
				numberOfDays = 28;
			}
			if(year%4==0) {
				numberOfDays = 29;
			}
			break;
		default:
			// No cases match then default will be taken.
			numberOfDays = 31;
		}
		System.out.printf("The number of days in month %d year %d are %d",month,year,numberOfDays);
	}
}
