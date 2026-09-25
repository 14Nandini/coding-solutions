class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') st.push(ch);
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (st.isEmpty() || !isMatching(st.peek(), ch)) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}