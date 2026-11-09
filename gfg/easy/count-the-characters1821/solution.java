class Solution {
	int getCount(String S, int N) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int i = 0;
		while (i < S.length()) {
			char ch = S.charAt(i);
			int j = i;
			while (j < S.length() && S.charAt(j) == ch)
				j++;
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
			i = j;
		}
		int c = 0;
		for (int val : hm.values()) {
			if (val == N)
				c++;
		}
		return c;
	}
}
