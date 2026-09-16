class Solution {
    static String decodedString(String s) {
        // code here
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        int k = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');
            }
            else if(ch == '['){
                num.push(k);
                str.push("[");
                k = 0;
            }
            else if(ch == ']'){
                StringBuilder sb = new StringBuilder();
                while(!str.isEmpty() && str.peek() != "["){
                    sb.insert(0,str.pop());
                }
                if(!str.isEmpty()) str.pop();
                String temp = sb.toString().repeat(num.pop());
                str.push(temp);
            }
            else str.push(String.valueOf(ch));
        }
        StringBuilder res = new StringBuilder();
        while(!str.isEmpty()){
            res.insert(0, str.pop());
        }
        return res.toString();
    }
}