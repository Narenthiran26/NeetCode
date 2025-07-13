class Solution {
    int[][]memo;
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        memo=new int[nums.length][2];
        for(int i[]:memo){
            Arrays.fill(i,-1);
        }
        return Math.max(robb(nums,0,nums.length-2,0),robb(nums,1,nums.length-1,1));
    }
    private int robb(int[] nums,int start,int end,int idx){
        if(start>end){
            return 0;
        }
        if(memo[start][idx]!=-1){
            return memo[start][idx];
        }

        memo[start][idx]=Math.max(robb(nums,start+1,end,idx),nums[start]+robb(nums,start+2,end,idx));
        return memo[start][idx];
    }
}
