import java.util.*;

public class Solution9_4 {
	public static List<List<Integer>> getSubsets(List<Integer> set) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		subsetHelper(set, result, set.size() - 1);
		return result;
	}

	public static void subsetHelper(List<Integer> set, List<List<Integer>> result, int index) {
		if (index < 0) {
			result.add(new ArrayList<Integer>());
			return;
		}
		subsetHelper(set, result, index - 1);
		int len = result.size();
		for (int i = 0; i < len; i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.addAll(result.get(i));
			tmp.add(set.get(index));
			result.add(tmp);
		}
	}

	public static void main(String [] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		for (Integer i : a) System.out.print(i + "\t");
		System.out.println();
		List<List<Integer>> result = getSubsets(a);
		for (List<Integer> l : result) {
			for (Integer i : l) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}

}