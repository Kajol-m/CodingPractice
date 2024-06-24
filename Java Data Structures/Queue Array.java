package queue;

public class QueueArray {
	
	static int queue[];
	static int front;
	static int rear;
    static int capacity;
    
    QueueArray(int size) {
		queue = new int[size];
		capacity=size;
		front = -1;
		rear = -1;
	}

	static boolean isFull() {
		return (rear == capacity- 1);
	}

	static boolean isEmpty() {
		if (front == -1 || front == rear + 1)
			return true;
		else
			return false;
	}

	void enqueue(int item) {
		if (isFull())
			System.out.println("Overflow");
		else if (rear == -1) {
			rear++;
			front++;
			queue[rear] = item;
		} else {
			rear++;
			queue[rear] = item;
		}
	}

	void dequeue() {
		if (isEmpty())
			System.out.println("Underflow");
		else
			front++;
	}

	static int peek() {
		return queue[front];
	}

	void display() {
		int i = front;
		System.out.println("Queue elements: ");
		while (i <= rear) {
			System.out.print(queue[i] + " ");
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray Queue1=new QueueArray(5);
		Queue1.enqueue(1);
		Queue1.enqueue(11);
		Queue1.enqueue(12);
		Queue1.enqueue(13);

		Queue1.display();
		System.out.println();
		Queue1.dequeue();
		Queue1.display();
		System.out.println();
		System.out.println("Peek "+peek());
		System.out.println(isEmpty());
		System.out.println(isFull());

	}

}
