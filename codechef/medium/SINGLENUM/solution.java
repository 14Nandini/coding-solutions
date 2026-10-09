class Solution {
    public int singleNumber(int[] nums) {
        // write your code here
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result;
    }
}