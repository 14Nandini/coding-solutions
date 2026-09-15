

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        HashSet<Character> hs = new HashSet<>();
        for(char ch : data.toCharArray()){
            if(hs.contains(ch)) return false;
            hs.add(ch);
        }
        return true;
    }
}