package stack;


public class StackArray {
	int data[];
	int top;
	int capacity;
	
	StackArray(int size){
		data=new int[size];
		this.capacity=size;
		top=-1;
	}
	void push(int x) {
		if(top==capacity) {
			System.out.println("Overflow");
		}
		else {
			data[++top]=x;
		}
	}
	int pop() {
		if(top==-1) {
			System.out.println("Underflow");
			return -1;
		}
		else {
			int x=data[top];
			top--;
			return x;
		}
	}
	int peek() {
		if(top==-1) {
			System.out.println("Underflow");
			return -1;
		}
		else {
			return data[top];
		}
		
	}
	
	public void display() {
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray Stack1=new StackArray(6);
		Stack1.push(1);
		Stack1.push(11);
		Stack1.push(12);
		Stack1.push(13);
		Stack1.push(14);
		Stack1.push(24);
		Stack1.display();
		System.out.println();
		System.out.println("Popped "+Stack1.pop());
		Stack1.display();
		System.out.println();
		System.out.println("Top element "+Stack1.peek());

	}

}
