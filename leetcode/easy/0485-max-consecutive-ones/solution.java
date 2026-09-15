class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 1, max = 0;
        if(nums[0] == 1) c++;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == 1 && nums[i] == 1){
                c++;
                max = Math.max(c, max);
            }
            else c = 1;
        }
        return max;
    }
}