import java.util.Scanner;

public class GuessingJava {

	public static void main(String[] args) {
		int low=1, high=1000, guess=-1, count=0, avg=0;
		Scanner inp = new Scanner(System.in);
		System.out.printf("Think of a number between 1 and 1000. I will guess seven or less tries.\n");
	
		//1st guess
		avg=(low+high)/2;
		System.out.printf("Hey - Is the number - %2d\n",avg);
		count++;
		System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.\n");
		guess = inp.nextInt();
		if (guess==0)
		{	
			System.out.printf("I guess the number in %d times.\n", count);
			System.exit(1);
		}
		else 
			if (guess==1)
				high=avg-1;
				else 
					if (guess == 2)
						low = avg + 1;
	
		
		//2nd guess
		avg=(low+high)/2;
		System.out.printf("Hey - Is the number - %2d\n",avg);
		count++;
		System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
		guess = inp.nextInt();
		if (guess==0)
		{	
			System.out.printf("I guess the number in %d times.\n", count);
			System.exit(1);
		}
		else 
			if (guess==1)
				high=avg-1;
				else 
					if (guess == 2)
						low = avg + 1;	
		
		//3rd guess
		avg=(low+high)/2;
		System.out.printf("Hey - Is the number - %2d\n",avg);
		count++;
		System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
		guess = inp.nextInt();
		if (guess==0)
		{	
			System.out.printf("I guess the number in %d times.\n", count);
			System.exit(1);
		}
		else 
			if (guess==1)
				high=avg-1;
				else 
					if (guess == 2)
						low = avg + 1;
		
		//4th guess
		avg=(low+high)/2;
		System.out.printf("Hey - Is the number - %2d\n",avg);
		count++;
		System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
		guess = inp.nextInt();
		if (guess==0)
		{	
			System.out.printf("I guess the number in %d times\n", count);
			System.exit(1);
		}
		else 
			if (guess==1)
				high=avg-1;
				else 
					if (guess == 2)
						low = avg + 1;
		
		//5th guess
		avg=(low+high)/2;
		System.out.printf("Hey - Is the number - %2d\n",avg);
		count++;
		System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
		guess = inp.nextInt();
		if (guess==0)
		{	
			System.out.printf("I guess the number in %d times\n", count);
			System.exit(1);
		}
		else 
			if (guess==1)
				high=avg-1;
				else 
					if (guess == 2)
						low = avg + 1;	
		
		//6th guess
		avg=(low+high)/2;
		System.out.printf("Hey - Is the number - %2d\n",avg);
		count++;
		System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
		guess = inp.nextInt();
		if (guess==0)
		{	
			System.out.printf("I guess the number in %d times\n", count);
			System.exit(1);
		}
		else 
			if (guess==1)
				high=avg-1;
				else 
					if (guess == 2)
						low = avg + 1;
		//7th guess
				avg=(low+high)/2;
				System.out.printf("Hey - Is the number - %2d\n",avg);
				count++;
				System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
				guess = inp.nextInt();
				if (guess==0)
				{	
					System.out.printf("I guess the number in %d times\n", count);
					System.exit(1);
				}
				else 
					if (guess==1)
						high=avg-1;
						else 
							if (guess == 2)
								low = avg + 1;
				//8th guess
				avg=(low+high)/2;
				System.out.printf("Hey - Is the number - %2d\n",avg);
				count++;
				System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
				guess = inp.nextInt();
				if (guess==0)
				{	
					System.out.printf("I guess the number in %d times\n", count);
					System.exit(1);
				}
				else 
					if (guess==1)
						high=avg-1;
						else 
							if (guess == 2)
								low = avg + 1;	
				//9th guess
				avg=(low+high)/2;
				System.out.printf("Hey - Is the number - %2d\n",avg);
				count++;
				System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
				guess = inp.nextInt();
				if (guess==0)
				{	
					System.out.printf("I guess the number in %d times\n", count);
					System.exit(1);
				}
				else 
					if (guess==1)
						high=avg-1;
						else 
							if (guess == 2)
								low = avg + 1;	

				//10th guess
				avg=(low+high)/2;
				System.out.printf("Hey - Is the number - %2d\n",avg);
				count++;
				System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
				guess = inp.nextInt();
				if (guess==0)
				{	
					System.out.printf("I guess the number in %d times\n", count);
					System.exit(1);
				}
				else 
					if (guess==1)
						high=avg-1;
						else 
							if (guess == 2)
								low = avg + 1;	
				//11th guess
				avg=(low+high)/2;
				System.out.printf("Hey - Is the number - %2d\n",avg);
				count++;
				System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
				guess = inp.nextInt();
				if (guess==0)
				{	
					System.out.printf("I guess the number in %d times\n", count);
					System.exit(1);
				}
				else 
					if (guess==1)
						high=avg-1;
						else 
							if (guess == 2)
								low = avg + 1;	
				//12th guess
				avg=(low+high)/2;
				System.out.printf("Hey - Is the number - %2d\n",avg);
				count++;
				System.out.printf("Enter Enter 0 if guessed correctly, 1 for lower and 2 for higher.");
				guess = inp.nextInt();
				if (guess==0)
				{	
					System.out.printf("I guess the number in %d times\n", count);
					System.exit(1);
				}
				else 
					if (guess==1)
						high=avg-1;
						else 
							if (guess == 2)
								low = avg + 1;	



	}

}
