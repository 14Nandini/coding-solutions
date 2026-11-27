class Solution {
    public int countEdges(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int res = 0;
        for (int i = 0; i < adj.size(); i++){
			for (int j = 0; j < adj.get(i).size(); j++){
			    res++;
			}
        }
        return res/2;
    }
}