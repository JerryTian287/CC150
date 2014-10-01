
public class Solution1_7 {
	public static void setZero(int [][] matrix) {
		boolean [] row = new boolean [matrix.length];
		boolean [] column = new boolean [matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column [j] = true;
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] || column[j]) matrix[i][j] = 0;
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
		int [][] a = {{1,2,3,4},{5,0,0,8},{9,10,11,12}};
		setZero(a);
		printMatrix(a);
	}
}
