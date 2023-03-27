package list.arraylist.implementation;

public class ArrayList {
	private int size = 0;
	private Object[] elementObjects = new Object[100]; 
	
	public boolean addFirst(Object element) {
		
		return add(0, element);
	}
	
	public boolean addLast(Object element) {		
		elementObjects[size] = element;
		size++;
		
		return true;
	}

	public boolean add(int index, Object element) {
		for(int i = size-1; i >=index ; i--) {
			elementObjects[i+1] = elementObjects[i];
		}
		elementObjects[index] = element;
		size++;
		
		return true;
	}
	
	public String toString() {
		String result = "[";
		
		for(int i=0; i<size;i++) {
			if(elementObjects[i] != null) {
				result += size-1 == i ? elementObjects[i].toString() : elementObjects[i].toString() + ", ";
			}
			
		}
		result += "]";
		return result;
	}

	public Object remove(int index) {
		Object removed = elementObjects[index];
		for(int i=index; i<size; i++) {
			elementObjects[i] = elementObjects[i+1];
		}
		size--;
		
		return removed;
	}

	public Object removeFirst() {
		return remove(0);
	}
	
	public Object removeLast() {
		return remove(size-1);
	}

	public Object get(int index) {
		return elementObjects[index];
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(Object element) {
		for(int i =0; i<size; i++) {
			if(element.equals(elementObjects[i])) {
				return i;
			}
		}
		
		return -1;
	}

	public ListIterator listIterator() {
		
		
		return new ListIterator();
	}
	
	class ListIterator{
		private int nextIndex = 0;
		
		public Object next() {
			return elementObjects[nextIndex++];
		}

		public boolean hasNext() {
			return nextIndex < size;
		}

		public Object previous() {
			return elementObjects[--nextIndex];
		}

		public boolean hasPrivious() {
			// TODO Auto-generated method stub
			return nextIndex > 0;
		}

		public void add(Object element) {
			ArrayList.this.add(nextIndex++, element);			
		}

		public void remove() {   
			ArrayList.this.remove(nextIndex-1);
			nextIndex--;
			
		}
	}
	
	
}
