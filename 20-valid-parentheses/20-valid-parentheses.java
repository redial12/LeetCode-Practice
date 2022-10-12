class Solution {
    public boolean isValid(String s) {
        //map of opening parentheses and map of closing parentheses
        //iterate through string and if map contains opening key, add it to stack
        //if its closing key, remove from stack and check if stack's opening key-value is equal to current closing key
        
        HashMap<Character, Character> openParentheses = new HashMap<Character, Character>();
        Stack<Character> stack = new Stack<Character>();
        
        openParentheses.put('(', ')');
        openParentheses.put('{', '}');
        openParentheses.put ('[', ']');
        
        //if string length of 1
        if(s.length() == 1)
            return false;
        
        for(int i = 0; i < s.length(); i++){
            //add current opening parentheses to stack
            if(openParentheses.containsKey(s.charAt(i))){
                stack.add(s.charAt(i));
            }else{
                //if at closing parentheses while stack is empty
                if(stack.size() == 0){
                    return false;
                }
                //remove from top of stack and check if parenthesis is the correct closing parentheses
                char stackChar = stack.pop();
                if(openParentheses.get(stackChar) != s.charAt(i)){
                    return false;
                }
            }
        }
        //if there are still brackets left to be closed
        if(stack.size() == 0)
            return true;
        return false;
    }
}
