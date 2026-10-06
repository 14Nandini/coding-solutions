class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int last = arr.length - 1;
        int beforeLast = last - 1;
        return arr[last] * arr[beforeLast];
    }
}
