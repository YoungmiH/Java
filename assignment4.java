import java.util.Scanner;
/*Youngmi Ahn
Introduction to Computer Programming Using Java / CIS 36a
Proj2
02/01/2016
02/01/2016*/

public class assignment4 {
	private static Scanner a1;
	private static Scanner a2;

	static int readI(String a) {
		int x = 0;
		System.out.printf("%s",a);
		a1 = new Scanner(System.in);
		x = a1.nextInt();
		System.out.println(x);
		return x;
		}
	
	static float readF(String a) {
		float x = 0;
		System.out.printf("%s",a);
		a2 = new Scanner(System.in);
		x = a2.nextFloat();
		System.out.println(x);
		return x;
		}

	//1. The amount paid for the stock alone (without the commission).
	static float amtPaidForStock(int s, float p){
		float s1 = 0;
		s1 = (float)( (s/100) * p );
		System.out.printf("The amount paid for the stock alone is  %f\n",s1);
		return s1;
	}
	
	//2. The amount of the commission.
	static float calcComm(int s, float p){
		float c = 0;
		c = (float)( ((s * p)/100) * 0.02f );
		System.out.printf("The amount of the commision is %f\n",c);
		return c;
	}
	
	//3. The total amount paid (for the stock plus the commission). 
	static void totalPaid(int s, float p){
		float t1 = 0;
		t1 = calcComm(s,p) + amtPaidForStock(s,p);
		System.out.printf("The total amount paid is %f\n",t1);
	}
	
	//Write a program that calculates and displays the following:
	public static void main(String[] args) {
		int s = readI("How much the stock price?"); 
		float p = readF("How much price the share?");
		
		amtPaidForStock(s,p);
		calcComm(s, p);
		totalPaid(s, p);
	}
	
}
