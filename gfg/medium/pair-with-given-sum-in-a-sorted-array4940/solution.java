class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int c = 0;
        for(int num : arr){
            int temp = target - num;
            if(hm.containsKey(temp)){
                c += hm.get(temp);
            }
            hm.put(num, hm.getOrDefault(num , 0) + 1);
        }
        return c;
    }
}
