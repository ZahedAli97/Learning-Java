import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
	public static void occurences(int[] array) {
		int count;
		// array.length-1 because the last element is '0'
		for(int i=0; i<array.length-1; i++) {
			if(array[i]==-999) {
				continue;
			}
			System.out.printf("%d occurs ",array[i]);
			count=0;
			// if j!=i=1 then j=-999 will replace i value as well thus breaking whole functionality
			// array.length-1 because the last element is '0'
			for(int j=i+1;j<array.length-1;j++) {
				if(array[i]==array[j]) {
					count++;
					array[j]=-999;
				}
			}
			count++;
			if(count>1) {
				System.out.printf("%d times.\n",count);
			} else {
				System.out.printf("%d time.\n",count);
			}
			array[i]=-999;
		}
	}
	public static void main(String[] args) {
		int i=0;
		System.out.print("Enter the number of elements for Input : ");
		Scanner userInput = new Scanner(System.in);
		int arrayLength = userInput.nextInt();
		int inputArray[] = new int[arrayLength];
		try {
		System.out.print("Enter the integers between 1 and 100 : ");
		while(userInput.hasNextInt()) {
			int newElement = userInput.nextInt();
			if(newElement==0) {
				System.out.println("'0' Signifies end of Input.");
				break;
			}
			else if((newElement>100) || (newElement<1)) {
				System.out.printf("'%d' is not in range of 1 and 100.\n",newElement);
				break;
			}
			inputArray[i] = newElement;
			i++;
		}
		occurences(inputArray);
		} catch(Exception e) {
			System.out.println("Error : Looks like you Entered more number of Elements than you wanted.");
		}
	}
}
