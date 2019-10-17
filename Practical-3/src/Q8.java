public class Q8 {
	public static void main(String[] args) {
		int count=0;
		for(int i=33;i<127;i++) {
			count+=1;
			System.out.printf("%c ",(char)i);
			if(count==10) {
				count=0;
				System.out.printf("\n");
			}
		}
	}
}
