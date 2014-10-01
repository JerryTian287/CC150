
public class Solution1_6 {
    public static void rotate(int[][] matrix) {
        if (matrix == null) return;
        if (matrix.length <= 1) return;
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - first - 1;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int tmp = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = tmp;
            }
        }   
    }
    
    public static void printMatrix(int [][] matrix) {
    	int m = matrix.length;
    	int n = matrix[0].length;
    	for (int i = 0; i < m; i++) {
    		for (int j = 0; j < n; j++) {
    			System.out.print(matrix[i][j]);
    			System.out.print('\t');
    		}
    		System.out.print('\r');
    	}
    }
    
    public static void main(String [] args) {
    	int [][] a = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
    	printMatrix(a);
    	rotate(a);
    	printMatrix(a);
    	boolean [] b = new boolean [5];
    	for (boolean s : b) {
    		System.out.print(s);
    		System.out.print('\t');
    	}
    }
}
