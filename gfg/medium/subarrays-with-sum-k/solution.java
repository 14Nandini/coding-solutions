class Solution {
    public int cntSubarrays(int[] arr, int k) {
        int n = arr.length;
        int res = 0, psum = 0, c = 0;
		Map<Integer, Integer> hm = new HashMap<>();
		hm.put(0,1);
		for(int i = 0; i < n; i++){
			psum = psum + arr[i];
			if(hm.containsKey(psum - k)){
				c = c + hm.get(psum - k);
			}
			hm.put(psum, hm.getOrDefault(psum, 0) + 1);
		}
		return c;
    }
}