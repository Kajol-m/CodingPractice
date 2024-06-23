package stack;

class Stack{
	int data;
	Stack next;
	
	Stack(int d){
		this.data=d;
		next=null;
	}
}

public class StackLinkedList {
	static Stack head=null;
	
	public void push(int data) {
		Stack p=new Stack(data);
		
		if(head==null) {
			head=p;
		}
		else {
			p.next=head;
			head=p;
		}
	}
	
	public int pop() {
		if(head==null) {
			return -1;
		}
		else {
			Stack p=head;
			head=head.next;
			return p.data;
		}
		
	}
	public int peek() {
		Stack p=head;
		return p.data;
	}
	public void display() {
		Stack p=head;
		while(p!=null) {
			System.out.print(p.data+" ");
			p=p.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList Stack1=new StackLinkedList();
		Stack1.push(1);
		Stack1.push(11);
		Stack1.push(12);
		Stack1.push(13);
		Stack1.push(14);
		Stack1.display();
		System.out.println();
		System.out.println("Popped "+Stack1.pop());
		Stack1.display();
		System.out.println();
		System.out.println("Top element "+Stack1.peek());

	}

}
