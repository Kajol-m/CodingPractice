package queue;

class Queue{
	int data;
	
	Queue next;
	
	Queue(int d){
		this.data=d;
		next=null;
	}
}
public class QueueLinkedList {
    static Queue front=null;
    static Queue rear=null;
    
	public void enqueue(int data) {
		Queue q=new Queue(data);
		
		if(front==null) {
			front=q;
			rear=q;
		}
		else {
			rear.next=q;
			rear=q;
		}
	}
	
	public void dequeue() {
		if(front==null) {
			System.out.println("The queue is empty");
		}
		front=front.next;
	}
	
	public  void display() {
		Queue temp=front;
		while(temp!=null) {
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList Queue1=new QueueLinkedList();
		Queue1.enqueue(1);
		Queue1.enqueue(11);
		Queue1.enqueue(12);
		Queue1.enqueue(13);

		Queue1.display();
		System.out.println();
		Queue1.dequeue();
		Queue1.display();
		
	}

}
