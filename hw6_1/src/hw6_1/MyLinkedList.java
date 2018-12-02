package hw6_1;

public class MyLinkedList {

	private Node head=null;
	
	public class Node{
		int data;
		Node link;
		public Node() {
			this.link=null;
		}
		public Node(int data) {
			this.data=data;
			this.link=null;
		}
	}
	
	public void addFirst(int data) {
		Node n=new Node(data);
		n.link=head;
		head=n;
	}
	@Override
	public String toString() {
		String s="";
		Node n=head;
		while(n!=null) {
			s=s+Integer.toString(n.data)+" ";
			n=n.link;
		}
		return s;
	}
	public int size() {
		int s=0;
		Node n=head;
		while(n!=null) {
			s++;
			n=n.link;
		}
		return s;
	}
	public void addLast(int data) {
		Node c=new Node(data);
		Node n=head;
		while(n.link!=null) {
			n=n.link;
		}
		n.link=c;
		n=c;
	}
	public int removeFirst() {
		Node n=head;
		head=n.link;
		return n.data;
	}
	public int removeLast() {
		Node n=head;
		Node d=n;;
		while(n.link!=null) {
			d=n;
			n=n.link;
		}
		int r=n.data;
		d.link=null;
		return r;
	}
}
