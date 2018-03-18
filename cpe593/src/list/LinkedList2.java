package list;

public class LinkedList2 {
	private static class Node {
		int val;
		Node next;
		Node(int v, Node next) {
			val = v;
			this.next = next;
		}
	}
	private Node head;
	private Node tail() {
		Node p = head;
		if(p == null) {
			return null;
		}
		for(p = head; p.next != null; p = p.next)
			;
		return p;		
	}
	public LinkedList2() {
		head = null;
	}
	public void addStart(int v) {
		head = new Node(v, head);
		}
	public void addEnd(int v) {
		if(head == null) {
			head = new Node(v, null);
			return;
		}
		tail().next = new Node(v, null);
		return;
		
	}
	public int removeStart() {
		if(head == null) {
			return -1;
		}
		int a = head.val;
		head = head.next;
		return a;
	}
	public void removeEnd() {
		if(head == null) {
			return;
		}
		if(head.next == null) {
			head = null;
		}
		Node p = head;
		Node q;
		for(q = p.next; q.next != null; p = q, q = q.next) {
			p = q;
			q = q.next;
		}
		p.next = null;
		return;
	}
	public boolean isEmpty() {
		return head == null;
	}
	

}
