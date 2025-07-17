class Solution {
    int[] memo;
    public int coinChange(int[] coins, int amount) {
    memo=new int[amount+1];
    Arrays.fill(memo,-1);
    int result=coin(coins,amount);
    return result==Integer.MAX_VALUE?-1:result;   
    }
    private int coin(int[] coins,int amount){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(memo[amount]!=-1){
            return memo[amount];
        }

        int minValue=Integer.MAX_VALUE;
        for(int c:coins){
            int result=coin(coins,amount-c);
            if(result!=Integer.MAX_VALUE){
                minValue=Math.min(minValue,result+1);
            }
        }
        memo[amount]=minValue;
        return memo[amount];
    }
}
