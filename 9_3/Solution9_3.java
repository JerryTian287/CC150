public class Solution9_3 {
	public static int hasMagicIndex(int [] a) {
		return hasMagicIndex(a, 0, a.length - 1);
	}
	private static int hasMagicIndex(int [] a, int start, int end) {
		if (start > end || start < 0 || end >= a.length) return -1;
		int mid = (end + start) / 2;
		if (a[mid] == mid) return mid;
		else if (a[mid] > mid) return hasMagicIndex(a, start, mid - 1);
		else return hasMagicIndex(a, mid + 1, end);
	}

	public static void main(String [] args) {
		int [] a = {-1, 0, 1, 2, 4, 6, 7};
		System.out.println(Solution9_3.hasMagicIndex(a));
	}
}