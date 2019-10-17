public class Q6 {
	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		System.out.println("      Kilograms       Pounds     ");
		System.out.println("-------------------------------------");
		for(int i=1;i<200;i+=2) {
			System.out.printf("       %d              %.1f       \n",i,i*2.2);
			System.out.println("-------------------------------------");
		}
	}
}
