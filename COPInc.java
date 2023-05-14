/*Allison Lujan
 *COP2805C-22537
 *Homework 1
 *1-15-2023
 */

package cop2805;

public class COPInc{

	public static void main(String[] args) { //main function that iterates through sales by $1000
		
		System.out.println("Sales\t\t\t\tIncome"); //Printing header for table
		
		for(double sales = 1000.00; sales <= 9000.00; sales += 1000.00) {	//Two for loops solely for spacing purposes		
			System.out.println("$" + sales + "\t\t\t\t$" + computeIncome(sales));
		}
		for(double sales = 10000.00; sales <= 20000.00; sales += 1000.00) {			
			System.out.println("$" + sales + "\t\t\t$" + computeIncome(sales));
		}
	}

	
		public static double computeIncome(double salesAmount){//computeIncome function that holds formulas
			
			double base = 5000.00;
			double income;			
			
			if(salesAmount <= 5000.00){        //Creating the first tier formula
				income = base + (salesAmount * .08);
				salesAmount = 0.00;               
			} else if (salesAmount <= 10000){  //Creating the second tier formula
				income = base + (5000.00 * .08) + ((salesAmount - 5000.00) * .10);
			} else{                            //Creating the third tier formula
				income = base + (5000.00 * .08) + (5000.00 * .10) + ((salesAmount - 10000.00) * .12);
			}
			
		return income;
	}

}
