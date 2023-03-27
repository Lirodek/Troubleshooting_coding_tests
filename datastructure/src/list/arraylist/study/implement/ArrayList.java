package list.arraylist.study.implement;

public class ArrayList {
	private Object[] elements = new Object[100];
	private int size = 0;

	public void add(Object element) {
		// TODO Auto-generated method stub
		elements[size++] = element;
	}
	
	public void add(int index, Object element) {
		size++;
		for(int i=size; index<i; i--) {
			elements[i] = elements[i-1];
		}
		elements[index] = element;
	}
	
	public Object remove(int index) {
		size--;
		for(int i = index ; i< size; i++) {
			elements[i] = elements[i+1];
		}
		return elements[index];
	}
	
	public String toString() {
		String result = "[";
		for(int i=0 ; i<size; i++) {
			if(i < size-1) {
				result += elements[i] + ",";
				
			} else {
				result += elements[i] + "]";
			}
			 
		}
		return result;
	}

	public void addFirst(Object element) {
		add(0, element);
	}


}
