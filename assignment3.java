/*Youngmi Ahn
Introduction to Computer Programming Using Java / CIS 36a
Assignment 3
02/01/2016
02/01/2016*/

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {

    	 int qtytv=0, qtyvcr=0, qtyremo=0, qtycd=0, qtytape=0;
    	 Scanner a1 = new Scanner(System.in);
    	 
    	 System.out.printf("How many TV's were sold? ");
    	 qtytv = a1.nextInt();
    	 System.out.printf("How many VCR's were sold? ");
    	 qtyvcr = a1.nextInt();
    	 System.out.printf("How many remote controller's were sold? ");
    	 qtyremo = a1.nextInt();
    	 System.out.printf("How many CD's were sold? ");
    	 qtycd = a1.nextInt();
    	 System.out.printf("How many Tape Recorder's were sold? ");
    	 qtytape = a1.nextInt();
    	 
    	 final float tvp  = 400.00f;
    	 final float vcrp = 220.00f;
    	 final float remop = 35.20f;
    	 final float cdp = 300.00f;
    	 final float tapep = 150.00f;
    	 final float stax = 8.25f;
    	 
        	//declare 5 variables to store total values for each item.
         //like - totaltv or totalvcr, totalrc etc.
    	 float totaltv  = 0.0f;
    	 float totalvcr = 0.0f;
    	 float totalremo = 0.0f;
    	 float totalcd = 0.0f;
    	 float totaltape = 0.0f;
    	 
    	 //write expressions to compute the total for each item.
    	 totaltv   = tvp  * qtytv  ;
    	 totalvcr  = vcrp * qtyvcr ;		 
    	 totalremo   = remop  * qtyremo  ;
    	 totalcd  = cdp * qtycd ;
    	 totaltape  = tapep * qtytape ;
    	 
    	 //compute subtotal
    	 float subtotal = 0.0f;
    	 subtotal = totaltv + totalvcr + totalremo + totalcd + totaltape;
    	 
    	 //compute salestax
    	 float salestax = 0.0f;
    	 salestax = subtotal * stax / 100;
    	 
    	 //compute total
    	 float total = 0.0f;
    	 total = subtotal + salestax;
    	 
    	 System.out.printf("Welcome to Stone Age Best Buy\n");
    	 System.out.printf("%3s\t%20s\t%10s\t%11s\n","QTY","DESCRIPTION","UNIT PRICE","TOTAL PRICE");
    	 System.out.printf("%3d\t%20s\t%10.2f\t%11.2f\n",qtytv,"TV",tvp,totaltv);
    	 System.out.printf("%3d\t%20s\t%10.2f\t%11.2f\n",qtyvcr,"VCR",vcrp,totalvcr);
    	 System.out.printf("%3d\t%20s\t%10.2f\t%11.2f\n",qtyremo,"Remote Controller",remop,totalremo);
    	 System.out.printf("%3d\t%20s\t%10.2f\t%11.2f\n",qtycd,"CD",cdp,totalcd);
    	 System.out.printf("%3d\t%20s\t%10.2f\t%11.2f\n",qtytape,"Tape",tapep,totaltape);

    	 //print values for all items.
    	 //print subtotal
    	 System.out.printf("%40s\t%11.2f\n","SUBTOTAL",subtotal);
    	 //print tax
    	 System.out.printf("%40s\t%11.2f\n","TAX",salestax);
    	 //print total 
    	 System.out.printf("%40s\t%11.2f\n","TOTAL",total);
    }
}



