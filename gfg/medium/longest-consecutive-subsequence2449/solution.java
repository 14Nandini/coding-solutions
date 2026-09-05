class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr) hs.add(num);
        int maxCnt = 0;
        for(int num : hs){
            if(!hs.contains(num - 1)){
                int currNum = num;
                int c = 1;
                while(hs.contains(currNum + 1)){
                    currNum += 1;
                    c += 1;
                }
                maxCnt = (c > maxCnt) ? c : maxCnt;
            }
        }
        return maxCnt;
    }
}