public class Solution9_2 {
	public static int numOfPaths(int[][] grid) {
		if (grid == null || grid [0] == null) return 0;
		int m = grid.length;
		int n = grid[0].length;
		int [][] numGrid = new int [m][n];
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (grid[0][i] == 1) flag = false;
			if (flag) numGrid[0][i] = 1;
			else numGrid[0][i] = 0;
		}
		flag = true;
		for (int i = 0; i < m; i++) {
			if (grid[i][0] == 1) flag = false;
			if (flag) numGrid[i][0] = 1;
			else numGrid[i][0] = 0;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (grid[i][j] == 1) numGrid[i][j] = 0;
				else {
					numGrid[i][j] = numGrid[i - 1][j] + numGrid[i][j - 1];
				}
			}
		}

		return numGrid[m - 1][n - 1];
	}

	public static void main(String [] args) {
		int [][] grid = new int [2][3];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = 0;
			}
		}
		grid[0][2] = 1;
		System.out.println(Solution9_2.numOfPaths(grid));
	}
}