class Solution {
    public boolean isSubset(int a[], int b[]) {

        Map<Integer, Integer> map = new HashMap();
        for(int x : a){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(int y:b){
            if(!map.containsKey(y) || map.get(y) == 0) return false;
            else map.put(y, map.get(y) - 1);
        }
        return true;
    }
}