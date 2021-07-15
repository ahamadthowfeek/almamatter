package alammatter;

import java.util.Scanner;

public class OddOrEven {
	
   public static void main(String args[])   { 
	   int num;
	   System.out.println("Enter an integer number:");
	   
	   @SuppressWarnings("resource")
	Scanner input =new Scanner(System.in);
	   
	   num=input.nextInt();
	   
	   if(num%2==0);
	   
	   System.out.println("Entered the numberis even");
	   
	   
	   System.out.println("Entered number is odd");
   }

}
