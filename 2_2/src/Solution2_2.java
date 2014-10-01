
public class Solution2_2 {
	public static LinkedListNode nthToLast(LinkedListNode head, int n) {
		if (head == null || n < 1) return null;
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
		for (int i = 0; i < n - 1; i++) {
			if (p2 == null) return null;
			p2 = p2.next;
		}
		
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p1;
	}
	
	public static void main(String [] args) {
		LinkedListNode a = new LinkedListNode(1);
		int n = 32;
		for (int i = 2; i <= n; i++) a.appendToTail(i);
		LinkedListNode tmp = nthToLast(a, 1);
		System.out.print(tmp.val);
	}
}
