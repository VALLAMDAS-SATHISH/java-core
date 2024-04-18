package com.learning.core.day4session1;

	import java.util.Scanner;

	class Node {
	    double data;
	    Node next;

	    public Node(double data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class Stack {
	    Node top;

	    public Stack() {
	        this.top = null;
	    }

	    public void push(double data) {
	        Node newNode = new Node(data);
	        newNode.next = top;
	        top = newNode;
	    }

	    public double pop() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	            return -1; // or throw an exception
	        }
	        double popped = top.data;
	        top = top.next;
	        return popped;
	    }

	    public void display() {
	        Node current = top;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	}

	public class D04P09_2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Stack stack = new Stack();

	        System.out.println("Enter elements to push onto the stack (separated by spaces):");
	        String input = scanner.nextLine();
	        String[] elements = input.split(" ");

	        for (String element : elements) {
	            double value = Double.parseDouble(element);
	            stack.push(value);
	        }

	        System.out.print("The elements of the stack are: ");
	        stack.display();

	        double popped1 = stack.pop();
	        double popped2 = stack.pop();

	        System.out.print("After popping twice: ");
	        stack.display();

	        scanner.close();
	    }
	}

