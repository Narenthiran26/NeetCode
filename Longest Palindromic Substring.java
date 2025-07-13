class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        String substr=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String odd=expandCenter(s,i,i);
            String even=expandCenter(s,i,i+1);

            if(odd.length()>substr.length()){
                substr=odd;
            }
            if(even.length()>substr.length()){
                substr=even;
            }
        }
        return substr;
    }
    public String expandCenter(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}
