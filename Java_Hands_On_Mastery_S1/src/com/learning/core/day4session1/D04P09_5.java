package com.learning.core.day4session1;

class Node01 {
	int data;
	Node01 next;

	public Node01(int data) {
		this.data = data;
		this.next = null;
	}
}

class Queue {
	private Node01 front, rear;

	public Queue() {
		this.front = this.rear = null;
	}

	// Method to add an item to the queue
	void enqueue(int item) {
		Node01 newNode = new Node01(item);

		// If queue is empty, then new node is front and rear both
		if (this.rear == null) {
			this.front = this.rear = newNode;
			return;
		}

		// Add the new node at the end of the queue and change rear
		this.rear.next = newNode;
		this.rear = newNode;
	}

	// Method to remove an item from queue
	int dequeue() {
		// If queue is empty, return null
		if (this.front == null)
			return -1;

		// Store previous front and move front one node ahead
		Node01 temp = this.front;
		this.front = this.front.next;

		// If front becomes null, then change rear to null as well
		if (this.front == null)
			this.rear = null;

		return temp.data;
	}

	// Method to display the elements in the queue
	void display() {
		Node01 current = this.front;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class D04P09_5 {
	public static void main(String[] args) {
		Queue queue = new Queue();

		// Enqueue elements
		queue.enqueue(89);
		queue.enqueue(99);
		queue.enqueue(109);
		queue.enqueue(209);
		queue.enqueue(309);

		// Display elements in the queue
		System.out.print("Elements in queue: ");
		queue.display();

		// Remove two elements
		queue.dequeue();
		queue.dequeue();

		// Display elements in the queue after removal
		System.out.print("After removing two elements: ");
		queue.display();
	}
}
