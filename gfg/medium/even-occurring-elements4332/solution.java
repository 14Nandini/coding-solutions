import java.util.*;

class Solution {
	public ArrayList<Integer> findEvenOccurrences(int[] arr) {
		// code here
		HashMap<Integer, Integer> map = new HashMap<> ();
		ArrayList<Integer> list = new ArrayList<> ();
		for (int a :arr)
			{
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		for (int a :arr)
			{
			if (map.get(a)%2 == 0 && list.contains(a) == false)
				list.add(a);
		}
		if (list.isEmpty())
			list.add(-1);
		return list;
	}
}
