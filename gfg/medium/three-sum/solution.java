class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        int target = 0, n = arr.length;
        Arrays.sort(arr);
        Set<ArrayList<Integer>> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            int j = i + 1, k = n - 1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    set.add(new ArrayList(Arrays.asList(arr[i], arr[j], arr[k])));
                    j++;
                    k--;
                }
                else if(sum < target) j++;
                else k--;
            }
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        res.addAll(set);
        Collections.sort(res, Comparator.comparing((ArrayList<Integer> list) -> list.get(0))
        .thenComparing(list -> list.get(1)).
        thenComparing(list -> list.get(2)));
        return res;
    }
}
