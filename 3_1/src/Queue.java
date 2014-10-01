
public class Queue {
	Node first, last;
	
	void enqueue(Object item) {
		Node p = new Node(item);
		if (last == null) {
			last = p;
			first = last;
		}
		else {
			last.next = p;
			last = last.next;
		}
	}
	
	Object dequeue() {
		if (first == null) return null;
		Object item = first.val;
		first = first.next;
		if (first == null) last = first;
		return item;
	}
}
