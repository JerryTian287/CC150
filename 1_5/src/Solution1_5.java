
public class Solution1_5 {
	public char [] replaceSpace(char [] str) {
		if (str == null) return str;
		int numOfSpace = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == ' ') numOfSpace++;
		}
		
		int totLen = str.length + 2 * numOfSpace;
		int len = str.length;
		char [] result = new char [totLen];
		for (int i = len - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				result[totLen - 1] = '0';
				result[totLen - 2] = '2';
				result[totLen - 3] = '%';
				totLen -= 3;
			}
			else {
				result[totLen - 1] = str[i];
				totLen -= 1;
			}
		}
		return result;
	}
	
	public static void main(String [] args) {
		Solution1_5 test = new Solution1_5();
		//char [] a = {' ', ' ', ' ', ' ', ' ', ' '};
		char [] a = new char [0];
		char [] b = test.replaceSpace(a);
		System.out.print(b);
	}
}
