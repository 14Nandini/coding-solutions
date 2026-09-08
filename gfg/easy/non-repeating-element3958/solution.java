class Solution {
    public int firstNonRepeating(int[] arr) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        for(int num : arr){
            if(hm.get(num) == 1) return num;
        }
        return 0;
    }
}
