class Solution {
    int[] memo;
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        memo=new int[nums.length];
        Arrays.fill(memo,-1);
        return robb(nums,0);
    }
    private int robb(int[] nums,int i){
        if(i>=nums.length){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        memo[i]=Math.max(robb(nums,i+1),nums[i]+robb(nums,i+2));
        return memo[i];
    }
}
