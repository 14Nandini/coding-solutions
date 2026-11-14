class Solution {
    String maxString;

    public String findMaximumNum(String s, int k) {
        maxString = s;
        solve(s.toCharArray(), k, 0);
        return maxString;
    }

    void solve(char[] arr, int k, int index) {
        if (k == 0 || index == arr.length) return;

        int n = arr.length;
        char maxChar = arr[index];

        for (int i = index + 1; i < n; i++) {
            if (arr[i] > maxChar) {
                maxChar = arr[i];
            }
        }

        if (maxChar != arr[index]) k--;

        for (int i = n - 1; i >= index; i--) {
            if (arr[i] == maxChar) {
                swap(arr, index, i);

                String curr = new String(arr);
                if (curr.compareTo(maxString) > 0) {
                    maxString = curr;
                }

                solve(arr, k, index + 1);

                swap(arr, index, i); 
            }
        }
    }

    void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}