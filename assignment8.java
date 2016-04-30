
public class assignment8 

{
 static boolean passed(char[] c, char[] s) {
 boolean pass = false;
 int passingScore = 13;
 int totalCorrect = 0;
 
 totalCorrect = totalCorrectAnswers(c,s);
 if( totalCorrect >= passingScore)
 {
	 pass = true;
	 
 }

 return pass;
 }

 static int totalCorrectAnswers(char[] c, char[] s) {
 int tc=0;
for (int counter = 0; counter < 13; counter++)
{
	
	if (c[counter] == s[counter])
	{
		
	tc++;
		
	}
	
	
	
}
 
 
 return tc;
 }

 static int totalInCorrectAnswers(char[] c, char[] s) {
 int inc = 0;
 
 for (int counter = 0; counter < 13; counter++)
 {
 	
 	if (c[counter] != s[counter])
 	{
 		
 	inc++;
 		
 	}
 	
 	
 	
 }
 
 
 return inc;
 }

 static char[] questionNumbersMissed(char[] c, char[] s) {
 char ia[] = new char[15];
 for (int i = 0; i < c.length; i++) 
 
 {
 if (c[i] != s[i])
 ia[i] = c[i];
 else
 ia[i] = '1';
 }
 return ia;
 }

 static void printqm(char[] x) {
 for (int i = 0; i < x.length; i++) {
 if (x[i] != '1')
 System.out.printf("\tWrong answer for q=%d. Correct answer=%c\n",
 (i + 1), x[i]);
 }
 }

 public static void main(String[] args) {
 char[] correctAns = { 'B', 'D', 'A', 'A', 'C', 'D', 'A', 'B', 'C', 'A', 'B', 'C', 'D', 'A', 'B' };
 char[] studentAns = { 'B', 'C', 'C', 'C', 'D', 'D', 'A', 'C', 'C', 'A', 'B', 'C', 'D', 'A', 'B' };
 if (passed(correctAns, studentAns) == true)
 System.out.printf("Your exam result = Passed.\n");
 else
 System.out.printf("Your exam result = Failed.\n");
 System.out.printf("Total Correct Answers=%d\n",totalCorrectAnswers(correctAns, studentAns));
 System.out.printf("Total Incorrect Answers=%d\n",totalInCorrectAnswers(correctAns, studentAns));
 System.out.printf("Questions Missed\n");
 char qm[] = questionNumbersMissed(correctAns, studentAns);
 printqm(qm);
 }
}