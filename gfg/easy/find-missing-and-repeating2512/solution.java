class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        // al = [-1, -1] 0th idx for duplicate  1st idx for missing
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-1,-1));
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for(int i = 1; i <= arr.length; i++){
            if(!hm.containsKey(i)) al.set(1,i); // missing
            else if(hm.get(i) > 1) al.set(0,i); // occurs twice
        }
        return al;
    }
}
