class Solution {
	public boolean checkWithinK(int[] arr, int k) {
		// code here
		HashMap<Integer, Integer> hm = new HashMap<>();
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			if (hm.containsKey(a)) {
				if (i - hm.get(a) <= k) return true;
			}
		    hm.put(a, i);
		}
		return res <= k;
	}
}
