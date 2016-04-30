import java.util.*;
import java.lang.Math;

public class Assignment7 {
    static int displaymenu(Scanner a1) {
        System.out.printf("Serious Calculator \n");
        System.out
                .printf("Select operation:\n 1. Add. 2. Subtract 3. Multiply 4. SIN 5. COS 6. TAN"
                		+ " 7. Floor\n 8. Ceiling 9. sqRoot 10. CubeRoot 11. log 12. log10 13. round \n \n");
        int op = a1.nextInt();
        return op;
    }

    static void processInput(int op, Scanner a1) {
        switch (op) {
             case 1: add(a1); break;
             case 2: subtract(a1); break;
             case 3: multiply(a1); break;
             case 4: sin(a1); break;
             case 5: cos(a1); break;
             case 6: tan(a1); break;
             case 7: floor(a1); break;
             case 8: ceiling(a1); break;
             case 9: sqRoot(a1); break;
             case 10: cubeRoot(a1); break;
             case 11: log(a1); break;
             case 12: log10(a1); break;
             case 13: round(a1); break;
             default: System.out.print("Invalid Selection"); break;
             
             
        }
    }

    static void add(Scanner a1)
    {
        int x=0, y=0;
        System.out.printf("Adding:\n Enter 1st int value\n");
        x=a1.nextInt();
        System.out.printf("Enter 2nd int value\n");
        y=a1.nextInt();
        System.out.printf("Sum of %d and %n is %d\n",x, y,(x+y));
    }
    
    static void subtract(Scanner a1)
    {
        int x=0, y=0;
        System.out.printf("Subtracting:\n Enter 1st int value\n");
        x=a1.nextInt();
        System.out.printf("Enter 2nd int value\n");
        y=a1.nextInt();
        System.out.printf("Difference of %d and %d is %d\n",x, y,(x-y));
    }
    
    static void multiply(Scanner a1)
    {
        int x=0, y=0;
        System.out.printf("Multiplying:\n Enter 1st int value\n");
        x=a1.nextInt();
        System.out.printf("Enter 2nd int value\n");
        y=a1.nextInt();
        System.out.printf("Product of %d and %d is %d\n",x, y,(x*y));
    }
    
    static void sin(Scanner a1)
    {
        double x;
        System.out.printf("SIN:\n Enter 1st double value\n");
        x=a1.nextDouble();
        System.out.printf("SIN of %f is %f\n",x, Math.sin(x));
    }
    
    static void cos(Scanner a1)
    {
        double x;
        System.out.printf("COS:\n Enter 1st double value\n");
        x=a1.nextDouble();
        System.out.printf("COS of %f is %f\n",x, Math.cos(x));
    }
    
    static void tan(Scanner a1)
    {
        double x;
        System.out.printf("TAN:\n Enter 1st double value\n");
        x=a1.nextDouble();
        System.out.printf("TAN of %f is %f\n",x, Math.tan(x));
    }
    
    static void floor(Scanner a1)
    {
        double x;
        System.out.printf("Finding floor of:\n Enter 1st double value\n");
        x=a1.nextDouble();
        System.out.print("Floor is: "); 
        System.out.print((Math.floor(x)));
        System.out.print("\n");
    }
    
    static void ceiling(Scanner a1)
    {
        double x;
        System.out.printf("Finding ceiling of:\n Enter 1st double value\n");
        x=a1.nextDouble();
        System.out.printf("Ceiling of %f is %f\n",x, Math.ceil(x));
    }
    
    static void sqRoot(Scanner a1)
    {
        double x;
        System.out.printf("Finding sqRoot of:\n Enter 1st double value\n");
        x=a1.nextDouble();
        System.out.printf("SqRoot of %f is %f\n",x, Math.sqrt(x));
    }
    
    static void cubeRoot(Scanner a1)
    {
        double x;
        System.out.printf("Finding sqRoot of:\n Enter 1st double value\n");
        x=a1.nextDouble();
        System.out.printf("CubeRoot of %f is %f\n",x, Math.cbrt(x));
    }
    
    static void log(Scanner a1)
    {
        double x;
        System.out.printf("Finding log of:\n Enter 1st double value\n");
        x=a1.nextDouble();
        System.out.printf("Log of %f is %f\n",x, Math.log(x));
    }
    
    static void log10(Scanner a1)
    {
        double x;
        System.out.printf("Finding log10 of:\n Enter 1st double value\n");
        x=a1.nextDouble();
        System.out.printf("Base 10 log of %f is %f\n",x, Math.log10(x));
    }
    
    static void round(Scanner a1)
    {
        double x;
        System.out.printf("Rounding:\n Enter 1st double value\n");
        x=a1.nextDouble();
        System.out.printf("%f rounds to %d \n",x, Math.round(x));
    }
    
    public static void main(String[] args) {
        int flag = 1; // continue/stop the program.
        Scanner a1 = new Scanner(System.in);
        int op = 0;
        do {
            op = displaymenu(a1); // showing all operation and taking input for
                                    // which operation to perform.
            System.out.printf("Op = %d\n",op);
            if (op > 0 && op < 14) {
                processInput(op, a1);    // op is value indicating an operation
                                        // read input, do the calculation and
                                        // print the output.
            } else
                System.out.printf("Invalid operation\n");
            System.out.printf("Would you like to continue? "
                    + "Enter 1 for yes, 0 for no\n");
            flag = a1.nextInt();
            if(flag==0)
                System.out.printf("Serious Calculator exiting....");
        } while (flag == 1);
    }
}
