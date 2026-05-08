class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        //edge case
        if(s.length() == 1) return false;

        for(Character ch : s.toCharArray())
        {
            if(ch == '{'|| ch == '[' || ch == '(')
            {
                stack.push(ch);
            }

            else
            {
                //no open braces
                if(stack.isEmpty()) 
                {
                    return false;
                }
                Character top = stack.pop();
                if(ch == '}' && top != '{') return false;
                if(ch == ')' && top != '(') return false;
                if(ch == ']' && top != '[') return false;
            }
        }

        if(stack.isEmpty())
        {
            return true;
        }

        return false;
    }
}