class Solution {
    int[] memo;
    public int lengthOfLIS(int[] nums) {
        memo= new int[nums.length];

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(memo[j]+1>memo[i]){
                        memo[i]=memo[j]+1;
                    }
                }
            }
        }
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            maxIndex=Math.max(maxIndex,memo[i]);
        }
        return maxIndex+1;
    }
}
