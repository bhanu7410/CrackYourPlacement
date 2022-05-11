class Solution {
    public boolean isValid(String s) {
        // int len =0;
        // while( len!=s.length() ){
        //     len=s.length();
        //     s=s.replace("[]","");
        //     s=s.replace("()","");
        //     s=s.replace("{}","");
        // }
        // return len==0;
        char[] stack = new char[s.length() + 1];
        int top = 1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack[top++] = c;
            } else if (c == ')' && stack[--top] != '(') {
                return false;
            } else if (c == ']' && stack[--top] != '[') {
                return false;
            } else if (c == '}' && stack[--top] != '{') {
                return false;
            }
        }
        return top == 1;        
    }
}
    
