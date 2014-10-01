import java.util.*;


public class Solution2_5 {
	public static LinkedListNode findLoop(LinkedListNode head) {
		LinkedListNode n1 = head;
		LinkedListNode n2 = head;
		
		while (n2.next != null) {
			n1 = n1.next;
			n2 = n2.next.next;
			
			if (n1 == n2) break;
		}
		
		if (n2.next == null) return null;
		
		n1 = head;
		while(n1 != n2) {
			n1 = n1.next;
			n2 = n2.next;
		}
		
		return n2;
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
		LinkedListNode b = new LinkedListNode(0);
		LinkedListNode curr = b;
		LinkedListNode loop = new LinkedListNode(0);
		for (int i = 1; i < 15; i++) {
			curr.next = new LinkedListNode(i);
			if (i != 14) curr = curr.next;
			if (i == 7) loop = curr;
		}
		curr.next = loop;
		LinkedListNode result = findLoop(b);
		System.out.print(result.val);
	}
}
