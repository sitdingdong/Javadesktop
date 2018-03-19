package list;

public class DoubleLinkedList implements Cloneable {
	private static class Node {
		int val;
		Node next, prev;
		Node(int v, Node next, Node prev) {
			val = v;
			this.next = next;
			this.prev = prev;
		}
	}
	private Node head, tail;
	public DoubleLinkedList() {
		head = null;
		tail = null;
	}
	public DoubleLinkedList clone() {
		DoubleLinkedList p = new DoubleLinkedList();
		if(this.head == null) {
			p.head = null;
			p.tail = null;
			return p;
		}
		p.head = new Node(this.head.val, null, null);
		if(this.head.next == null) {
			return p;
		}
		Node q = p.head;
		for(Node n = head.next; n.next != null; n = n.next) {
			Node temp = new Node(n.val, null, q);
			q.next = temp;
			q = q.next;
		}
		return p;
	}
	public void addStart(int v) {
		Node temp = new Node(v, head, null);
		if(head == null) {
			tail = temp;
		}else {
			head.prev = temp;
		}
		head = temp;
	}
	public void addEnd(int v) {
		Node temp = new Node(v, null, tail);
		if(tail == null) {
			head = temp;
		}else {
			tail.next = temp;
		}
		tail = temp;
	}
	public void removeStart() {
		if(head == null) {
			return;
		}
		if(head.next == null) {
			head = tail =null;
			return;
		}
		head = head.next;
		head.prev = null;
	}
	public void removeEnd() {
		if(tail == null) {
			return;
		}
		if(tail.prev == null) {
			head = tail = null;
		}
		tail = tail.prev;
		tail.next = null;
	}
	

}
