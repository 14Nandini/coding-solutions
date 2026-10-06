class Solution {
    public int missingNumber(int[] nums) {
        // write your code here
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums) hs.add(num);
        int n = nums.length, res = 0;
        while(n >= 0){
            if(hs.contains(n)) n--;
            else return n;
        }
        return res;
    }
}

