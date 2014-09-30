 
public class Solution1_1 {
	public boolean allUnique(String s) {
		if (s == null || s.length() == 0 || s.length() == 1) return true;
		for (int i = 0; i < s.length() - 1; i++) {
			char curr = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) == curr) return false;
			}
		}
		return true;
	}
	
	public boolean isUnique(String s) {
		boolean [] strSet = new boolean [256];
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i);
			if (strSet[index]) return false;
			strSet[index] = true;
		}
		return true;
	}
	
	public static void main(String [] args) {
		String s = "`~1234567890-=!@#$%^&*()_+][|}{';:/.,?>< qwer"
				+ "tyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		Solution1_1 test = new Solution1_1();
		System.out.println(test.isUnique(s));
		System.out.println(test.allUnique(s));
	}
}
