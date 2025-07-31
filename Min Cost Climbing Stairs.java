class Solution {
    int[] memo;
    public int minCostClimbingStairs(int[] cost) {
       memo=new int[cost.length];
       Arrays.fill(memo,-1);
       return Math.min(mincost(cost,0),mincost(cost,1));
    }
    private int mincost(int[] cost,int i){
        if(i>=cost.length){
            return 0;
        }

        if(memo[i]!=-1){
            return memo[i];
        }

        memo[i]=Math.min(cost[i]+mincost(cost,i+1),cost[i]+mincost(cost,i+2));
        return memo[i];
    }
}
