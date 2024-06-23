package linkedlist;

class Node{
	String name;
	int age;
	Node next;
	
	public Node(String n,int d) {
		this.name=n;
		this.age=d;
		next=null;
	}
}
public class LinkedList {
	static Node head=null;
	
	public void insBeg(String name,int age) {
		
		Node p=new Node(name,age);
		
		p.next=head;
	    head=p;
		
	}
	public  void insPos(String name,int age,int pos) {
		Node start=head;
		Node p=new Node(name,age);
		
		if(pos==0) {
			insBeg(name,age);
		}
		else {
			int i=0;
			Node temp=start;
			while(i<pos-1) {
				temp=temp.next;
				i++;
				if(temp==null) {
					System.out.print("Position out of range");
					return;
				}
			}
			Node x=temp.next;
			temp.next=p;
			p.next=x;
		}
	}
	public void insEnd(String name,int age) {
		Node start=head;
		while(start.next!=null) {
			start=start.next;
		}
		Node p=new Node(name,age);
		start.next=p;
		p.next=null;
	}
	
	public void delBeg() {
		if(head==null) {
			System.out.print("Empty list Bitch");
		}
		else {
		head=head.next;
	}
	}
	
	public void depPos(int pos) {
		Node start=head;
		int i=0;
		while(i<pos-1) {
			start=start.next;
			i++;
		}
		Node x=start.next;//Node x=start.next.next;
		Node y=x.next;//start.next=y;
		start.next=y;
	}
	public void delEnd() {
		Node temp=head;
		//int i=0;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	
	public int count() {
		Node temp=head;
		
		int count=1;
		while(temp.next!=null) {
			temp=temp.next;
			count++;
		}
		return count;
	}
	public  void displayll() {
	    Node start=head;
	    while(start!=null) {
	        System.out.print(start.name + " " + start.age+" ,");
	        
	        start=start.next;
	    }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		
		list1.insBeg("Kajol",21);
		list1.insBeg("Kaps",12);
		list1.insBeg("Apricot",11);
		list1.insBeg("joker",23);
		list1.insPos("Okhlama",14,2);
		list1.insEnd("Apple", 20);
		list1.displayll();
		System.out.println();
		System.out.print(list1.count()+" elements in Liked List list1.");
		System.out.println();
		list1.delBeg();
		list1.delEnd();
		list1.depPos(2);
		list1.displayll();
		System.out.println();
		System.out.print(list1.count()+" elements in Liked List list1 ater performing delete.");
		
		

	}

}
