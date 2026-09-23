class Solution {

    ArrayList<String> orderString(ArrayList<String> s) {
        // code here
        Collections.sort(s);
        ArrayList<String> res = new ArrayList<>();
        res.add(s.get(0));
        res.add(s.get(s.size()-1));
        return res;
    }
}