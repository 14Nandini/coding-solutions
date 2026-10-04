class Solution {
    public int[] mostFrequent(int N, int[] A) {
        //write your code  here 
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int a : A){
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }
        int maxKey = 0, maxVal = 0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int value = entry.getValue();
            if(value > maxVal){
                maxVal = value;
                maxKey = entry.getKey();
            }
        }
        int[] res = new int[2];
        res[0] = maxKey;
        res[1] = maxVal;
        return res;
    }
}