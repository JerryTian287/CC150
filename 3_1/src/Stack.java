
public class Stack {
	Node top;
	Object pop() {
		if (top == null) return null;
		Object item = top.val;
		top = top.next;
		return item;
	}
	void push(Object item) {
		Node tmp = new Node(item);
		tmp.next = top;
		top = tmp;
	}
}
