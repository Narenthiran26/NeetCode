class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int roBegin=0;int roEnd=matrix.length-1;int colBegin=0;int colEnd=matrix[0].length-1;

        while(roBegin<=roEnd && colBegin<=colEnd){
            for(int j=colBegin;j<=colEnd;j++){
                res.add(matrix[roBegin][j]);
            }
        roBegin++;
        for(int i=roBegin;i<=roEnd;i++){
            res.add(matrix[i][colEnd]);
        }
        colEnd--;
        if(roBegin<=roEnd){
            for(int j=colEnd;j>=colBegin;j--){
            res.add(matrix[roEnd][j]);
            }
        }
        roEnd--;
        if(colBegin<=colEnd){
            for(int i=roEnd;i>=roBegin;i--){
            res.add(matrix[i][colBegin]);
            }
        }
        colBegin++;
        }
        return res;
    }
}
