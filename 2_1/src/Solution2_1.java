import java.util.*;


public class Solution2_1 {
	public static void deleteDups(LinkedListNode n) {
		Hashtable<Integer, Boolean> table = new Hashtable<Integer,Boolean>();
		LinkedListNode pre = null;
		while (n != null) {
			if (table.containsKey(n.val)) pre.next = n.next;
			else {
				table.put(n.val,true);
				pre = n;
			}
			n = n.next;
		}
	}
	
	public static void deleteDups2(LinkedListNode head) {
		if (head == null) return;
		LinkedListNode pre = head;
		LinkedListNode curr = head.next;
		while (curr != null) {
			LinkedListNode runner = head;
			while (runner != curr) {
				if (runner.val == curr.val) {
					pre.next = curr.next;
					curr = pre.next;
					break;
				}
				runner = runner.next;
			}
			if (runner == curr) {
				pre = curr;
				curr = curr.next;
			}
		}
	}
	
	public static void deleteDups3(LinkedListNode head) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedListNode n = head;
		LinkedListNode pre = null;
		while(n != null) {
			if (list.contains(n.val)) {
				pre.next = n.next;
			}
			else {
				list.add(n.val);
				pre = n;
			}
			n = n.next;
		}
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
		LinkedListNode a = new LinkedListNode(1);
		a.appendToTail(2);
		a.appendToTail(2);
		a.appendToTail(2);
		a.appendToTail(3);
		a.appendToTail(4);
		printList(a);
		deleteDups3(a);
		printList(a);
	}
}
