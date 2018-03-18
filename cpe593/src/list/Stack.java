package list;

public class Stack {
	private LinkedList2 imp2;
	public Stack() {
		imp2 = new LinkedList2();
	}
	public void push(int a) {
		imp2.addStart(a);
	}
	public int dequeue() {
		return imp2.removeStart();
	}
	public boolean isEmpty() {
		return imp2.isEmpty();
	}

}


