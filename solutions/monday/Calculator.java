package solutions.monday;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double operandA = scan.nextDouble();
		scan.nextLine();
		String operator = scan.nextLine();
		double operandB = scan.nextDouble();

		if (operator.equals("+")) {
			System.out.println(operandA + " + " + operandB + " = " + (operandA + operandB));
		} else if (operator.equals("=")) {
			System.out.println(operandA + " - " + operandB + " = " + (operandA - operandB));
		} else if (operator.equals("*")) {
			System.out.println(operandA + " * " + operandB + " = " + (operandA * operandB));
		} else if (operator.equals("/")) {
			System.out.println(operandA + " / " + operandB + " = " + (operandA / operandB));
		} else if (operator.equals("%")) {
			System.out.println(operandA + " % " + operandB + " = " + (operandA % operandB));
		} else {
			System.out.println("Unknown operator.");
		}

		scan.close();
	}

}
