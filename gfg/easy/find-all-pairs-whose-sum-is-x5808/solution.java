/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        Arrays.sort(arr1);
        for(int i = 0; i < arr2.length; i++){
            hm.put(arr2[i], hm.getOrDefault(arr2[i], 0) + 1);
        }
        ArrayList<pair> pairList = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
            int u = arr1[i]; 
            int reqd = target - u;
            if(hm.containsKey(reqd)){
                int c = hm.get(reqd);
                for (int j = 0; j < c; j++) {
                    pairList.add(new pair((long) u, (long) reqd)); 
                }
            }
        }
        pair[] result = new pair[pairList.size()];
        return pairList.toArray(result);
    }
}