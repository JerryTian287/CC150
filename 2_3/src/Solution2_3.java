import java.util.*;

public class Solution2_3 {
	public static void deleteNode(LinkedListNode a) {
		if (a.next == null) {
			a = null;
			return;
		}
		a.val = a.next.val;
		a.next = a.next.next;
	}
	
	public static void printList(LinkedListNode a) {
		LinkedListNode tmp = a;
		while (tmp != null) {
			System.out.print(tmp.val);
			System.out.print('\t');
			tmp = tmp.next;
		}
	}
	
	public static void main(String [] args) {
		ArrayList<LinkedListNode> b = new ArrayList<LinkedListNode>();
		LinkedListNode del;
		for (int i = 0; i < 15; i++) {
			if (i == 7) {
				del = new LinkedListNode(i);
				b.add(del);
			}
			else b.add(new LinkedListNode(i)); 
		}
		for (int i = 0; i < 14; i++) {
			b.get(i).next = b.get(i + 1).next;
		}
		
		LinkedListNode a = new LinkedListNode(0);
		LinkedListNode n = a;
		LinkedListNode del0 = new LinkedListNode(0);
		for (int i = 1; i < 15; i++) {
			n.next = new LinkedListNode(i);
			if (i == 14) {
				n = n.next;
				del0 = n;
			}
			else n = n.next; 
		}
		//printList(a);
		deleteNode(del0);
		printList(a);
	}
	
}
