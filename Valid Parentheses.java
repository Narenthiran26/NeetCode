class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        Stack<Character> stack=new Stack<>();

        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                if(stack.isEmpty() || stack.pop()!=map.get(ch)){
                    return false;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
