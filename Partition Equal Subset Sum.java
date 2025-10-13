class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        if(sum%2!=0){
            return false;
        }

        int target=sum/2;
        boolean[] memo=new boolean[target+1];
        memo[0]=true;
        for(int i=0;i<nums.length;i++){
            for(int j=target;j>=nums[i];j--){
                memo[j]=memo[j]||memo[j-nums[i]];
            }
        }
        return memo[target];
    }
}
