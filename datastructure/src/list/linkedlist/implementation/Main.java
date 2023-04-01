package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList numbers = new LinkedList();
//		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		numbers.addLast(40);
		numbers.addLast(50);
		
		numbers.add(1, 15);
		
		
		System.out.println(numbers.removeFirst());
		
		System.out.println(numbers);
		
		
	}

}
