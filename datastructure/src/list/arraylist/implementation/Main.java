package list.arraylist.implementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);


		//numbers.removeLast();
		
		ArrayList.ListIterator li = numbers.listIterator();
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.remove();
			}
		}
		System.out.println(numbers.toString());
	}

}
