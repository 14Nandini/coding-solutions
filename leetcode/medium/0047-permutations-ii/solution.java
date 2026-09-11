class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resList, new ArrayList<>(), nums,new boolean[nums.length]);
        return resList;
    }
    public static List<List<Integer>> backtrack(List<List<Integer>> resList, List<Integer> tempList, int[] nums, boolean[] used){

        if(tempList.size() == nums.length && !resList.contains(tempList)){
            resList.add(new ArrayList<>(tempList));
            return resList;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;

            used[i] = true;
            tempList.add(nums[i]);

            backtrack(resList, tempList, nums, used);

            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
        return resList;
    }
}