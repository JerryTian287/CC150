
public class Solution1_3 {
	@SuppressWarnings("null")
	public static void removeDuplicates(char[] str) {
		if (str == null || str.length <= 1) return;
		int tail = 1;
		for (int i = 1; i < str.length; i++) {
			int j = 0;
			for (j = 0; j < tail; j++) {
				if (str[i] == str[j]) break; 
			}
			if (j == tail) {
				str[tail] = str[i];
				tail++;
			}
		}
		for (int i = tail; i < str.length; i++) str[i] = 0;
		//str[tail] = 0;
	}
	
	public static void main(String [] args) {
		Solution1_3 test = new Solution1_3();
		String a = "aaabbbaaa";
		char [] b = new char [a.length()];
		for (int i = 0; i < a.length(); i++) b[i] = a.charAt(i);
		Solution1_3.removeDuplicates(b);
		for (char s : b) System.out.print(s);
		int [][] c = new int [5][7];
		System.out.print(c.length);
	}
}
