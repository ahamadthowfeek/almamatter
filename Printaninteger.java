package alammatter;

import java.util.Scanner;

public class Printaninteger {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value for i..");
        
        int i=scan.nextInt();
        
        System.out.println("Enter value for j...");
        
        int j=scan.nextInt();
	
        int mul = i*j;
        		
        System.out.println("the multiplication of i and j is.."+mul);
        		
       
	}

}
