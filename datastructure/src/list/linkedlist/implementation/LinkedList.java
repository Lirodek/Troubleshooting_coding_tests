package list.linkedlist.implementation;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;
	
	private class Node{
		private Object data;
		private Node next;
		
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if( head.next == null ) {
			tail = head;
		}
	}

	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public void add(int index, Object input) {
		if(index == 0) {
			addFirst(input);
		} else {
			Node newNode = new Node(input);
			Node prevNode = node(index-1);
			Node nextNode = prevNode.next;
			prevNode.next = newNode;
			newNode.next = nextNode;
			size++;
			if(newNode.next == null) {
				tail = newNode;
			}
		}
		
	}
	
	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		
		while (temp.next !=  null) {
			str += temp.data += ", ";
			temp = temp.next;
		}
		str += temp.data;
		return str +"]";
		
		
	}
	
	public Node node(int index) {
		Node x = head;
		for(int i=0; i<index;i++) {
			x = x.next;
		}
		
		return x;
	}

	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object result = temp.data;
		temp = null;
		size--;
		return result;
		
	}
}
