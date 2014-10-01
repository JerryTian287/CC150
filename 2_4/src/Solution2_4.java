
public class Solution2_4 {
	public static LinkedListNode addList (LinkedListNode a, LinkedListNode b) {
		if (a == null) return b;
		if (b == null) return a;
		LinkedListNode curr = new LinkedListNode(0);
		LinkedListNode head = curr;
		int carry = 0;
		while(a != null && b != null) {
			curr.val = a.val + b.val + carry;
			//System.out.print(curr.val + "\t");
			if(curr.val > 9) {
				curr.val -= 10;
				carry = 1;
			}
			else carry = 0;
			//System.out.print(curr.val + "\t");
			a = a.next;
			b = b.next;
			if (a != null && b != null) {
				curr.next = new LinkedListNode(0);
				curr = curr.next;
			}
		}
		LinkedListNode pre = new LinkedListNode(0);
		//System.out.print(carry);
		if (a != null) {
			curr.next = a;
			while (a.next != null) {
				a.val += carry;
				if (a.val == 10) a.val = 0;
				else {
					carry = 0;
					break;
				}
				//pre = a;
				a = a.next;
			}
			//System.out.print(carry);
			if (carry == 1) {
				if (a.val == 9) {
					a.val = 0;
					a.next = new LinkedListNode(1);
				}
				else a.val += carry;
			}
		}
		if (b != null) {
			curr.next = b;
			while (b.next != null) {
				b.val += carry;
				if (b.val == 10) b.val = 0;
				else {
					carry = 0;
					break;
				}
				//pre = a;
				b = b.next;
			}
			//System.out.print(carry);
			if (carry == 1) {
				if (b.val == 9) {
					b.val = 0;
					b.next = new LinkedListNode(1);
				}
				else b.val += carry;
			}
		}
		
		if (a == null && b == null && carry > 0) curr.next = new LinkedListNode(carry);
		return head;
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
		int n = 5;
		for (int i = 2; i <= n; i++) a.appendToTail(i);
		LinkedListNode b = new LinkedListNode(1);
		n = 5;
		for (int i = 2; i <= n; i++) b.appendToTail(i);
		LinkedListNode result = addList(a, b);
		printList(result);
	}
}
