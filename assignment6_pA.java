import java.util.Scanner;


public class assignment6_pA 

{
	
	private static Scanner reader;

	public static void main(String[] args) {

	reader = new Scanner(System.in);
	System.out.println("Enter a number from 1 to 50: ");
	int n = reader.nextInt();
	if (n <= 0 || n > 50 )
	{
		System.out.println("Enter a valid number: ");
		n = reader.nextInt();
		
	}
	
	
	
	int sum = 0;
    do {
        
        n++;
        sum += n;

    	} while(n<=50);
    
    System.out.printf("%d",sum);
    
	}
}
