class Solution {
    public int findMinimumRemovals(List<int[]> intervalList) {
        
        // write your code here 
        int c = 0;
        //Collections.sort(intervalList.get);
        for(int i = 0; i < intervalList.size()-1; i++){
            int[] a = intervalList.get(i);
            int[] b = intervalList.get(i+1);
            if(a[0] > b[0]){
                intervalList.set(i,b);
                intervalList.set(i+1,a);
            }
        }
        for(int i = 0; i < intervalList.size()-1; i++){
            int[] a = intervalList.get(i);
            int[] b = intervalList.get(i+1);
            if(b[0] < a[1]){
                c++;
            } 
        }
        // System.out.println(intervalList);
        return c;
    }

}