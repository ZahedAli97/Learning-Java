public class Q10 {
	public static void main(String[] args) {
        int i,j,k,num; 
        System.out.println("pattern A :");
        for(i=0; i<5; i++) 
        { 	
        	num=1;
            for(j=0; j<=i; j++) 
            { 
                System.out.print(num+ " "); 
                num++; 
            }  
            System.out.println(); 
        } 
        System.out.printf("\npattern B :\n");
        for(i=6; i>0; i--) 
        { 	
        	num=1;
            for(j=0; j<i; j++) 
            { 
                System.out.print(num+ " "); 
                num++; 
            }  
            System.out.println(); 
        }
        System.out.printf("\npattern C :");
        num=10;
        for(i=0; i<6; i++) 
        { 	
        	for(k=0;k<num;k++) {
        		System.out.print(" ");
        	}
        	num-=2;
            for(j=i; j>0; j--) 
            { 
                System.out.print(j+ " "); 
            }  
            System.out.println(); 
        } 
        System.out.printf("\npattern D :\n");
        for(i=6; i>=0; i--) 
        {
        	for(k=6;k>i;k--) {
        		System.out.print("  ");
        	}
            for(j=1; j<=i; j++) 
            { 
                System.out.print(j+ " "); 
            }  
            System.out.println(); 
        }
    } 
}
