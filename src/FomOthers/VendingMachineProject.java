package FomOthers;

import java.util.Scanner;

public class VendingMachineProject {

	public static void main(String[] args) {


		
		Scanner scan=new Scanner (System.in);
		System.out.println();
		System.out.println(" =*=*=*=*=*=*=*=*=*Welcome to the Vending machine*=*=*=*=*=*=*=*=*=*");
		System.out.println();
		
		System.out.println("What would you like to do ? "
				+"\nPress \"1\" to select product"
				+"\nPress\"2\" to check out");
		int choice =scan.nextInt();
		switch (choice) {
		case 1:{
			product.main (args);
			break;
		}
		case 2:
		{
			System.err.println("There is nothing here");
		}
			
		}
		   }
	   }
	        
	
