package roboticsandbeyond;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		while (cont.equals("y")) {
			double operandA = scan.nextDouble();
			String operator = scan.nextLine();
			double operandB = scan.nextDouble();
			
			if (operator == "+") {
				System.out.println(operandA + " + " + operandB + " = "  + (operandA + operandB));
			} else if (operator == "-") {
				System.out.println(operandA + " - " + operandB + " = "  + (operandA - operandB));
			} else if (operator == "*") {
				System.out.println(operandA + " * " + operandB + " = "  + (operandA * operandB));
			} else if (operator == "/") {
				System.out.println(operandA + " / " + operandB + " = "  + (operandA / operandB));
			} else {
				System.out.println("Unknown operator.");
			}
			
			System.out.println("Continue? (y/n)");
			cont = scan.nextLine();
		}
		
		scan.close();
	}

}
