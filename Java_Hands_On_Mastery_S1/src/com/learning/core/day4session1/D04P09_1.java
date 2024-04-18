package com.learning.core.day4session1;

	public class D04P09_1 {
	    private int maxSize;
	    private String[] stackArray;
	    private int top;

	    public D04P09_1(int size) {
	        this.maxSize = size;
	        this.stackArray = new String[maxSize];
	        this.top = -1;
	    }

	    public void push(String element) {
	        if (isFull()) {
	            System.out.println("Stack is full. Cannot push element.");
	            return;
	        }
	        stackArray[++top] = element;
	    }

	    public String pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Cannot pop element.");
	            return null;
	        }
	        return stackArray[top--];
	    }

	    public boolean isEmpty() {
	        return (top == -1);
	    }

	    public boolean isFull() {
	        return (top == maxSize - 1);
	    }

	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty.");
	            return;
	        }
	        System.out.print("Stack: ");
	        for (int i = 0; i <= top; i++) {
	            System.out.print(stackArray[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	D04P09_1 stack = new D04P09_1(5);
	        stack.push("Hello");
	        stack.push("world");
	        stack.push("java");
	        stack.push("Programming");

	        System.out.println("After Pushing 4 Elements:");
	        stack.display();

	        String poppedElement = stack.pop();
	        System.out.println("After a Pop: " + poppedElement);
	        stack.display();
	    }
	}

