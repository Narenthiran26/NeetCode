class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] fre=new List[nums.length+1];
        for(int i=0;i<fre.length;i++){
            fre[i]=new ArrayList<>();
        }

        Map<Integer,Integer> map=new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            fre[entry.getValue()].add(entry.getKey());
        }

        int[] res=new int[k];
        int index=0;
        for(int i=fre.length-1;i>0 && index<k;i--){
            for(int n:fre[i]){
                res[index++]=n;
                if(index==k){
                    return res;
                }
            }
        }
        return res;

    }
}
