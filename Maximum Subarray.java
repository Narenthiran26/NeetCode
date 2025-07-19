class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int curSum=0;
            for(int j=i;j<n;j++){
                curSum+=nums[j];
                maxSum=Math.max(maxSum,curSum);
            }
        }
        return maxSum;
    }
}
//TC-O(n^2) SC-0(1)
