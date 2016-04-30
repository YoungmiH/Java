import java.util.Scanner;


public class assignment5 {

	private static Scanner a1;

	public static void main(String[] args){
		float numChecks = 0; 
		float totalfeeforchecks = 0;
		float totalfee = 0; 
		int totalbasecharge = 20;
		int bankfee = 10;
		System.out.printf("What's the number of checks for the month?"); 

		a1 = new Scanner(System.in);
		numChecks = a1.nextInt();
		
		
		if ((numChecks >0) && (numChecks <20)) //checks is between 1 and 19
			{
			totalfeeforchecks += numChecks*0.10f; //numcheck이 20이하일 경우 

			}
		
		else if(numChecks > 20) // numcheck이 20 이상일 경우 
			{
				totalfeeforchecks += (0.1f*19); // 0.1cent먼저 계산 
				
				numChecks -= 19; // 20을 뺀 나머지 numcheck
				
				if ((numChecks>0)&&(numChecks<20)){
					totalfeeforchecks += 0.08f*numChecks; //40이하의 numcheck-20 일 경우 0.08cent계산 
				}
				else
					{
						totalfeeforchecks += 0.08f*20; // numcheck-20이 40이상일 경우 
						numChecks -= 20; //numcheck-20-20 
						
							if ((numChecks>0)&&(numChecks<20)){
								totalfeeforchecks += 0.06f*numChecks; //numcheck이 40-60일경우 
							}
							else{
								totalfeeforchecks += 0.06f*20; //numcheck이 60일 경우 
								numChecks -= 20;
								
								if ((numChecks>0)&&(numChecks<20)){
									totalfeeforchecks += 0.04f*numChecks;//numcheck이 60이상일 경우 
									}
								}
					}
			}
		
			
			totalfee = totalfeeforchecks + totalbasecharge + bankfee;
			
			System.out.printf("Welcome to my Bank!\n");
			System.out.printf("We love charging fees all kinds of Fee. And we love your business So thank you!\n");
			System.out.printf("The more checks you write the more you save. Based on check fee schedule .\n");
			System.out.printf("10 cents for less than 20 checks :: .08 cents for 2039 checks :: \n");
			System.out.printf(".06 cents for 40 to 59 checks :: .04 each for 60 or more checks.!\n");
			System.out.printf("your charges are as follows: \n");
			
			System.out.printf("Total fee = %f\n",totalfee);
			System.out.printf("Total base charge = %d\n",totalbasecharge);
			System.out.printf("Total bank fee = %d\n",bankfee);
			System.out.printf("Total fee for checks = %f\n",totalfeeforchecks);
			

			

			
	}
}
