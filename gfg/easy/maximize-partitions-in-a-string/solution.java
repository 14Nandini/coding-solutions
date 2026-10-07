class Solution {
	public int maxPartitions(String s) {
		// code here
		int n = s.length();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = n - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (!hm.containsKey(ch))
				hm.put(ch, i);
		}
		int j = 0, c = 0;
		for (int k = 0; k < n; k++) {
			char ch = s.charAt(k);
			int lastOcc = hm.get(ch);
			j = Math.max(j, lastOcc);
			if (k == j) {
				c++;
			}
		}
		return c;
	}
}
