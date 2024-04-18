package com.learning.core.day4session1;



	public class D04P09_4 {
		private int maxSize;
		private int[] queueArray;
		private int front;
		private int rear;
		private int currentSize;

		public D04P09_4(int size) {
			this.maxSize = size;
			this.queueArray = new int[maxSize];
			this.front = 0;
			this.rear = -1;
			this.currentSize = 0;
		}

		public boolean isEmpty() {
			return currentSize == 0;
		}

		public boolean isFull() {
			return currentSize == maxSize;
		}

		public void enqueue(int data) {
			if (!isFull()) {
				rear = (rear + 1) % maxSize;
				queueArray[rear] = data;
				currentSize++;
			} else {
				System.out.println("Queue is full");
			}
		}

		public int dequeue() {
			if (!isEmpty()) {
				int temp = queueArray[front];
				front = (front + 1) % maxSize;
				currentSize--;
				return temp;
			} else {
				System.out.println("Queue is empty");
				return -1;
			}
		}

		public void displayQueue() {
			if (!isEmpty()) {
				int i = front;
				while (i != rear) {
					System.out.print(queueArray[i] + " ");
					i = (i + 1) % maxSize;
				}
				System.out.println(queueArray[rear]);
			} else {
				System.out.println("Queue is empty");
			}
		}

		public static void main(String[] args) {
			D04P09_4 queue = new D04P09_4(5);
			queue.enqueue(10);
			queue.enqueue(20);
			queue.enqueue(30);
			queue.enqueue(40);

			System.out.print("Elements in queue: ");
			queue.displayQueue();

			System.out.println("After removing first element:");
			queue.dequeue();

			System.out.print("Elements in queue: ");
			queue.displayQueue();
		}
	}
