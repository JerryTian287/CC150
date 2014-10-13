import java.util.ArrayList;
import java.util.List;




public class Solution9_6 {
	public static void validParentheses(int n) {
		List<String> result = new ArrayList<String>();
		char [] str = new char [2 * n];
		validParenthesesHelper(result, n, n, str, 0);
		for (String s : result) {
			System.out.println(s);
		}
	}

	private static void validParenthesesHelper(List<String> result, int leftRem, int rightRem, char [] str, int index) {
		if (leftRem < 0 || rightRem < leftRem) return; 
		if (leftRem == 0 && rightRem == 0) {
			result.add(String.copyValueOf(str));
		}
		else {
			if (leftRem > 0) {
				str[index] = '(';
				validParenthesesHelper(result, leftRem - 1, rightRem, str, index + 1);
			}

			if (rightRem > 0) {
				str[index] = ')';
				validParenthesesHelper(result, leftRem, rightRem - 1, str, index + 1);
			}
		}
	}

	public static void main(String [] args) {
		Solution9_6.validParentheses(3);
	}
}