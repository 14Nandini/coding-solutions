class Solution {
    public static String infixToPostfix(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) sb.append(ch);
            else if(ch == '(') st.push(ch);
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    sb.append(st.pop());
                }
                if(!st.isEmpty()) st.pop();
            }
            else{
                while(!st.isEmpty() && (
                    (ch == '^' && getPrecedence(ch) < getPrecedence(st.peek())) ||
                    (ch != '^' && getPrecedence(ch) <= getPrecedence(st.peek()))
                )){
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }
    static int getPrecedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        else if(ch == '*' || ch == '/') return 2;
        else if(ch == '^') return 3;
        return -1;
    }
}