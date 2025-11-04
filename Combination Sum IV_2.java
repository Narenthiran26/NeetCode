class Solution {
    private Map<Integer,Integer> map;
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        map=new HashMap<>();
        map.put(0,1);
        return dfs(nums,target);
    }
    private int dfs(int[] nums,int target){
        if(map.containsKey(target)) return map.get(target);
        int res=0;
        for(int n:nums){
            if(target<n){
                break;
            }
           res+= dfs(nums,target-n);
        }
        map.put(target,res);
        return res;
    }
}
