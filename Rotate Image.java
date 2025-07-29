class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        //transpose-ing matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //resversing the transposed matrix
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }

    //helper function for reversing the ROW
    private void reverse(int[] rox){
        int i=0;int j=rox.length-1;
        while(i<j){
            int temp=rox[i];
            rox[i]=rox[j];
            rox[j]=temp;
            i++;
            j--;
        }   
    }
}
