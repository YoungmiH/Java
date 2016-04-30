import java.util.Scanner;

/*Learn about the Pythagoras Theorem and 
1. write a program to find the value of hypotenuse 
if the other two sides of a triangle are known.
2. write another program to find the value of one 
side of triangle if hypotenuse and one side of a right triangle are known.
*/
import java.util.Scanner;

public class assignment4_p2 {
	private static Scanner a1;
	private static Scanner a2;
	private static Scanner a3;
	private static Scanner a4;

	
	static int readI(String a) {
		int x = 0;
		System.out.printf("%s",a);
		a1 = new Scanner(System.in);
		x = a1.nextInt();
		System.out.println(x);
		return x;
		}
	
	static int readF(String a) {
		int x = 0;
		System.out.printf("%s",a);
		a2 = new Scanner(System.in);
		x = a2.nextInt();
		System.out.println(x);
		return x;
		}
	
	static int readH(String a) {
		int x = 0;
		System.out.printf("%s",a);
		a3 = new Scanner(System.in);
		x = a3.nextInt();
		System.out.println(x);
		return x;
		}
	
	static int readG(String a) {
		int x = 0;
		System.out.printf("%s",a);
		a3 = new Scanner(System.in);
		x = a3.nextInt();
		System.out.println(x);
		return x;
		}
	
	static float calcHypotenuse (int a, int b){
		float c, c1;
		c=0; c1=0;
		c = (float)(Math.hypot(a,b));
		System.out.printf("The hypotenuse is  %f\n",c);
		return c;
	}
	
	static float calcSide (float c, float d){
		float d1 = 0; 
		float d2 =0;
		d1 = (float)((c*c)-(d*d));
		d2 = (float)(Math.sqrt(d1));
		System.out.printf("The other side is  %f\n",d2);
		return d2;
	}
	
	
	public static void main(String[] args) {
		int a = readI("Q1.What is the number of one ?"); 
		int b = readF("What is the number of another?");
		calcHypotenuse(a,b);

		float c = readH("Q2.What is the number of the hypotenuse?");	
		float d = readG("What is the number of the side one?");	

		calcSide (c,d);

	}
	
	
}
