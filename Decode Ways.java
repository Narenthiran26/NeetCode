class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] memo=new int[n+1];
        memo[0]=1;
        memo[1]=s.charAt(0)=='0'?0:1;

        for(int i=2;i<=n;i++){
            int singleD =Integer.valueOf(s.substring(i-1,i));
            int doubleD =Integer.valueOf(s.substring(i-2,i));

            if(singleD>=1){
                memo[i]+=memo[i-1];
            }
            if(doubleD>=10 && doubleD<=26){
                memo[i]+=memo[i-2];
            }
        }
        return memo[n];
    }
}
