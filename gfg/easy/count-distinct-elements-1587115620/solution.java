class Solution {
    public int countNonRepeated(int arr[]) {
        //  code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int cnt = 0;
        for(int val : hm.values()){
            if(val == 1) cnt++;
        }
        return cnt;
    }
}