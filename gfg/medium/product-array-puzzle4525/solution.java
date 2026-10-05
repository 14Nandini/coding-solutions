class Solution {
	public static int[] productExceptSelf(int arr[]) {
		// code here
		int n = arr.length;
		int[] ans = new int[n];
		ans[0] = 1;
		
		for (int i = 1; i<n; i++) {
			ans[i] = ans[i - 1] * arr[i - 1];
		}
		
		int suffix = 1;
		
		for (int j = n - 1; j >= 0; j--) {
			ans[j] *= suffix;
			suffix *= arr[j];
		}
		
		return ans;
	}
}
