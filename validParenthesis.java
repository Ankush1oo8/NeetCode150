/*
 * quite easy as there are only 3 formats to search
 * (),[],{}
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty())return false;
                char top=stack.peek();
                if(ch==')' && top!='(')return false;
                if(ch==']' && top!='[')return false;
                if(ch=='}' && top!='{')return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}