import java.util.Scanner;

public class Assignment6_pB {
	

		
		private static Scanner reader;

		public static void main(String[] args) {

		reader = new Scanner(System.in);
		
		
		System.out.println("Input Sales for Day 1: ");
		int sales1 = reader.nextInt();
		System.out.println("Input Sales for Day 2: ");
		int sales2 = reader.nextInt();
		System.out.println("Input Sales for Day 3: ");
		int sales3 = reader.nextInt();
		System.out.println("Input Sales for Day 4: ");
		int sales4 = reader.nextInt();
		System.out.println("Input Sales for Day 5: ");
		int sales5 = reader.nextInt();
		System.out.print("\n");
		
		int ast1 = sales1/100;
		int ast2 = sales2/100;
		int ast3 = sales3/100;
		int ast4 = sales4/100;
		int ast5 = sales5/100;
		
		System.out.println("SALES BAR CHART:\n");
		for (int counter = 0; counter < ast1; counter++)
		{
		
			System.out.print("*");
			
			
		}
		
		System.out.print("\n");
		
		for (int counter = 0; counter < ast2; counter++)
		{
		
			System.out.print("*");
			
			
		}
		
		System.out.print("\n");
		
		for (int counter = 0; counter < ast3; counter++)
		{
		
			System.out.print("*");
			
			
		}
		
		System.out.print("\n");
		
		for (int counter = 0; counter < ast4; counter++)
		{
		
			System.out.print("*");
			
			
		}
		
		System.out.print("\n");
		
		for (int counter = 0; counter < ast5; counter++)
		{
		
			System.out.print("*");
			
			
		}
		
		
	    
	
	}


}
