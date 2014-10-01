
public class Solution1_2 {
	public String reverseCString(String s) {
		if (s == null || s.length() <= 2) return s;
		s = "\0" + s;
		String tmp = "";
		for(int i = s.length() - 2; i >= 0; i--) tmp += s.charAt(i);
		return tmp;
	}
	
	public static void main(String [] args) {
		Solution1_2 test = new Solution1_2();
		String s = "gsebsnbsd\0";
		
		System.out.println(test.reverseCString(s));
	}
}
