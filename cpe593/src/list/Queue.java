package list;

public class Queue {
	private LinkedList2 imp;
	public Queue() {
		imp = new LinkedList2();
	}
	public void enqueque(int a) {
		imp.addEnd(a);
	}
	public int dequeue() {
		return imp.removeStart();
	}
	public boolean isEmpty() {
		return imp.isEmpty();
	}

}
