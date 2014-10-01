public class Solution9_1DP {
	public static final int MAX = 100;

	public static int countNumOfWays(int n) {
		int [] map = new int [MAX];
		for (int i = 0; i < map.length; i++) {
			map[i] = -1;
		}
		return countNumOfWays(n, map);
	}

	private static int countNumOfWays(int n, int [] map) {
		if (n < 0) return 0;
		if (n == 0) return 1;
		if (map[n] >= 0) return map[n];
		map[n] = countNumOfWays(n - 3, map) + countNumOfWays(n - 2, map) + countNumOfWays(n - 1, map);
		return map[n];
	}

	public static void main(String [] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(Solution9_1DP.countNumOfWays(n));
	}
}