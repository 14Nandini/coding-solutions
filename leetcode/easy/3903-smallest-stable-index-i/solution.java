class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        int[] minFromRight = new int[n];
        minFromRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minFromRight[i] = Math.min(nums[i], minFromRight[i + 1]);
        }
        
        int maxFromLeft = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxFromLeft = Math.max(maxFromLeft, nums[i]);
            
            int score = maxFromLeft - minFromRight[i];
            if (score <= k) {
                return i; 
            }
        }
        
        return -1;
    }
}