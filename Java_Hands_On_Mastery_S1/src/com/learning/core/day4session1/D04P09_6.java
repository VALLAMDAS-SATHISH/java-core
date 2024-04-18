package com.learning.core.day4session1;

public class D04P09_6 {
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;

	public D04P09_6(int capacity) {
		this.capacity = capacity;
		this.queue = new int[capacity];
		this.front = -1;
		this.rear = -1;
		this.size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue.");
			return;
		}
		if (isEmpty()) {
			front = 0;
		}
		rear = (rear + 1) % capacity;
		queue[rear] = item;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1;
		}
		int removedItem = queue[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front = (front + 1) % capacity;
		}
		size--;
		return removedItem;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Elements in circular queue: ");
		int i = front;
		do {
			System.out.print(queue[i] + " ");
			i = (i + 1) % capacity;
		} while (i != (rear + 1) % capacity);
		System.out.println();
	}

	public static void main(String[] args) {
		D04P09_6 cq = new D04P09_6(5);
		cq.enqueue(14);
		cq.enqueue(13);
		cq.enqueue(22);
		cq.enqueue(-8);
		cq.display();

		// Removing first element
		int removedItem = cq.dequeue();
		System.out.println("After removing first element: ");
		cq.display();
	}
}
