package com.learning.core.day4session1;

import java.util.Scanner;
import java.util.Stack;

public class D04P09_3 {

	// Function to perform operation based on operator
	public static int applyOperator(char op, int b, int a) {
		switch (op) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
			case '/':
				return a / b;
			default:
				return 0;
		}
	}

	// Function to evaluate expression
	public static int evaluateExpression(String expression) {
		Stack<Integer> operands = new Stack<>();
		Stack<Character> operators = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (ch == ' ')
				continue;
			if (Character.isDigit(ch)) {
				int num = 0;
				while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
					num = num * 10 + (expression.charAt(i) - '0');
					i++;
				}
				i--;
				operands.push(num);
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				while (!operators.empty() && hasPrecedence(ch, operators.peek())) {
					operands.push(applyOperator(operators.pop(), operands.pop(), operands.pop()));
				}
				operators.push(ch);
			}
		}

		while (!operators.empty()) {
			operands.push(applyOperator(operators.pop(), operands.pop(), operands.pop()));
		}

		return operands.pop();
	}

	// Function to check precedence of operators
	public static boolean hasPrecedence(char op1, char op2) {
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			return false;
		return true;
	}

	// Main function
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the expression:");
		String expression = scanner.nextLine();
		scanner.close();

		int result = evaluateExpression(expression);
		System.out.println("Output: " + result);
	}
}
