
public class Node {
	Node next = null;
	Object val;
	public Node(Object v) {
		val = v;
	}
	public void appendToTail(Object d) {
		Node end = new Node(d);
		Node n = this;
		while(n.next != null) n = n.next;
		n.next = end;
	}
}
