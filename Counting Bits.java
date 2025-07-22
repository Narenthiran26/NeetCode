class Solution {
    public int[] countBits(int n) {
        int[] memo=new int[n+1];
        for(int i=1;i<=n;i++){
            memo[i]=memo[i>>1]+(i&1);
        }
        return memo;
    }
}
