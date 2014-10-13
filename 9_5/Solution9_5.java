import java.util.*;

public class Solution9_5 {
	public static List<String> permuString(String s) {
		List<String> result = new ArrayList<String>();
		char [] a = new char [s.length()];
		s.getChars(0, s.length(), a, 0);
		//for (char c : a) System.out.print(c);
		Arrays.sort(a);
		permuStringHelper(result, a, 0);
		return result;
	}

	public static void permuStringHelper(List<String> result, char[] a, int index) {
		if (index == a.length) return;
		if (index == 0) {
			String tmp = "" + a[0];
			result.add(tmp);
			permuStringHelper(result, a, 1);
			return;
		}
		else {
			int len = result.size();
			for (int j = 0; j < len; j++) {
				String s = result.get(j);
				if(!result.contains(s + a[index])) result.set(j, s + a[index]);
				else result.remove(j);
				for (int i = 0; i < s.length(); i++) {
					StringBuffer tmp = new StringBuffer(s);
					tmp.insert(i, a[index]);
					if(!result.contains(tmp.toString())) result.add(tmp.toString());
				}
			}
			permuStringHelper(result, a, index + 1);
			return;
		}
	}

	public static void main(String [] args) {
		String a = "abb";
		List<String> result = new ArrayList<String>();
		result = Solution9_5.permuString(a);
		for (String s : result) {
			System.out.println(s);
		}
	}
}