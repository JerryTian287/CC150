
public class Solution1_4 {
	public boolean isAnagram (String a, String b) {	//check if b is the reverse of a 
		if (a == null && b == null) return true;
		if (a == null || b == null) return false;
		if (a.length() != b.length()) return false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(a.length() - 1 - i)) return false;
		}
		return true;
	}
	
	public boolean isAnagram2(String a, String b) {	//check if a and b contains same amount of 
													//same characters each
		if (a.length() != b.length()) return false;
		int [] charset = new int [256];
		int numOfChar = 0;
		int charComp = 0;
		for (int i = 0; i < a.length(); i++) {
			if (charset[a.charAt(i)] == 0) {
				numOfChar++;
			}
			charset[a.charAt(i)]++;
		}
		for (int i = 0; i < b.length(); i++) {
			int c = b.charAt(i);
			if (charset[c] == 0) {
				return false;
			}
			charset[c]--;
			if (charset[c] == 0) {
				charComp++;
				if (numOfChar == charComp) return true;
			}
		}
		return false;
		
	}
	
	public static void main(String [] args) {
		Solution1_4 test = new Solution1_4();
		String a = "acbd eed  ";
		String b = " edddcba  ";
		System.out.println(test.isAnagram(a, b));
		System.out.println(test.isAnagram2(a, b));
	}
}
