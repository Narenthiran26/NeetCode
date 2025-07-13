class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo=new int[n];
        return climb(n,0);
    }
    private int climb(int n,int i){
        if(i>=n){
            return i==n?1:0;
        }
        if(memo[i]!=0){
            return memo[i];
        }
        memo[i]=climb(n,i+1)+climb(n,i+2);
        return memo[i];
    }
}
