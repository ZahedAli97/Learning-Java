import java.util.Scanner;
import java.util.Random;
public class Q3 {
	public static void calculateWinner(int computer, int user) {
		if(user<computer) {
			if(user==0 && computer==2) {
				System.out.println("You Won!");
			} else {
				System.out.println("Computer Won!");
			}
		}
		else if(user>computer){
			if(user==2 && computer==0) {
				System.out.println("Computer Won!");
			} else {
				System.out.println("You Won!");
			}
		}
		else {
			System.out.println("It's a Draw!");
		}
	}
	public static String Choice(int role) {
		switch(role) {
		case 0:
			return "Scissor";
		case 1:
			return "Rock";
		default:
			return "Paper";
		}
	}
	public static void main(String[] args) {
		Random rand = new Random();
		int computerSelects = rand.nextInt(3);
		System.out.print("Scissor(0), Rock(1), Paper(2) : ");
		Scanner userInput = new Scanner(System.in);
		int userSelects = userInput.nextInt();
		System.out.printf("The Computer is %s, You are %s : ",Choice(computerSelects),Choice(userSelects));
		calculateWinner(computerSelects, userSelects);
	}
}
