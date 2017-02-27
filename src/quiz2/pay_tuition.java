package quiz2;

import java.util.Scanner;

public class pay_tuition {
public static void main(String[] args){
		
		try(Scanner input = new Scanner( System.in) ){
		
		double tuition; 
		double percent;
		double init_tuition;
 		double tuition_increase;
		double APR;
		double payment_term;
		double monthly_payment_term;
		double total_tuition;
		double monthly_pay;
		System.out.print("your first-year tuition.");
	    tuition = input.nextDouble();
	    
	    System.out.print("the percentage increase in price per year. ");
	    percent = input.nextDouble();
	    
	    double sum = 0;
	    for(int i = 0; i < 4; i++) {
	    	
	    	sum += (tuition * (Math.pow(1+percent,i)));
	    }
		
	    System.out.printf("The total tuition cost to complete your degree is: $%.2f \n", +sum);
		}
		
		}
}
