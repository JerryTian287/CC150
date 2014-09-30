public class Solution9_1 {
	public int countNumOfWays(int n) {
		if (n < 0) return 0;
		if (n == 0) return 1;
		else return countNumOfWays(n - 1) + countNumOfWays(n - 2) + countNumOfWays(n - 3);
	}

	public static void main(String [] args) {
		Solution9_1 test = new Solution9_1();
		int n = Integer.parseInt(args[0]);
		System.out.println(test.countNumOfWays(n));
	}
}