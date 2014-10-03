public class Solution9_3_followUp {
	public static int hasMagicIndex(int [] a) {
		return hasMagicIndex(a, 0, a.length - 1);
	}

	private static int hasMagicIndex(int [] a, int start, int end) {
		if (start > end || start < 0 || end >= a.length) return -1;
		int midIndex = (start + end) / 2;
		int midValue = a[midIndex];
		if (midIndex == midValue) return midIndex;
		int leftIndex = Math.min(midIndex - 1, midValue);
		int left = hasMagicIndex(a, start, leftIndex);
		if (left >= 0) return left;

		int rightIndex = Math.max(midIndex + 1, midValue);
		int right = hasMagicIndex(a, rightIndex, end);
		return right;
	}

	public static void main(String [] args) {
		int [] a = {-1, 0, 2, 2, 2, 6, 7};
		System.out.println(Solution9_3_followUp.hasMagicIndex(a));
	}
}