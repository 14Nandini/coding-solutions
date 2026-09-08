class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        int n = arr.length;
        if(n == 1) return arr[0];
        Arrays.sort(arr);
        StringBuilder res = new StringBuilder();
        char[] first = arr[0].toCharArray();
        char[] last = arr[n - 1].toCharArray();
        for(int i = 0; i < n; i++){
            if(first[i] != last[i]) break;
            res.append(first[i]);
        }
        return res.toString();
    }
}