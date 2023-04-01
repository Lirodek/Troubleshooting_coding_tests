package list.arraylist.study.implement;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("hello");
		list.add(9);
		list.add(3);
		list.add("2");
		
		list.remove(0);
		list.add(0, 5);
		list.addFirst("Head");
		list.addLast("Tail");
		
		System.out.println(list.toString());
		System.out.println(list.size());
	}
}
