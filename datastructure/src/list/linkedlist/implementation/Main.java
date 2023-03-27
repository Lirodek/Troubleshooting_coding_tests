package list.linkedlist.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterator<Integer> it;
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		it = numbers.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
