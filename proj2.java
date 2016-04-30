/*Youngmi Ahn
Introduction to Computer Programming Using Java / CIS 36a
Proj2
02/01/2016
02/01/2016*/

import java.util.Scanner;

public class proj2 {

	public static void main(String[] args) {
	
		int c=0;
		Scanner a1 = new Scanner(System.in);

		System.out.printf("How cold is it in Centigrade?");
		c = a1.nextInt();
		
		//
		float f  = 0.0f;
		f = 32 + c (180.0/100.0) ;
		
		System.out.printf("%20s\t%10.2f","That makes: ",f );
	
	}

	private static int c(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

}