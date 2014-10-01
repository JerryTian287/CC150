
public class LinkedListNode {
	LinkedListNode next = null;
	int val;
	public LinkedListNode(int v) {
		val = v;
	}
	public void appendToTail(int d) {
		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode n = this;
		while(n.next != null) n = n.next;
		n.next = end;
	}
}
