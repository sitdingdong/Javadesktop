package list;

public class ArrayGrow {
	private int[] val;
	private int used;
	//private int capacity;
	public ArrayGrow() {
		val = new int[1];
		used = 0;
	}
	public ArrayGrow(int size) {
		val = new int[size];
		used = 0;
	}
	public void grow() {
		if(used <= val.length) return;
		int[] temp = val;
		val = new int[val.length * 2];
		for(int i = 0; i < temp.length; i++) {
			val[i] = temp[i];
		}
	}
	public void addEnd(int a) {
		grow();
		val[used++] = a;   
		
	}
	public int get(int index) {
		return val[index];
	}
	public int length() {
		return used;
	}
}
