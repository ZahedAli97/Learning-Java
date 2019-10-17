import java.util.Scanner;
import java.lang.Math;

public class Q11{
	
	public void pyramid() {
		for(int i=0;i<8;i++) {
			// Remove if else to get true output, but it is distorted because of presence of 3 digit numbers
			if(i!=7) {
			for(int j=i;j<8;j++) {
				System.out.print("  ");
			}}else {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print((int)(Math.pow(2, k))+" ");
			}
			for(int l=i-1;l>=0;l--) {
				System.out.print((int)(Math.pow(2, l))+" ");
			}
			System.out.print("\n");
		}
	}
	
	
	
	public static void main(String[] args) {
		Q11 myObj = new Q11();
		myObj.pyramid();
	}
}
