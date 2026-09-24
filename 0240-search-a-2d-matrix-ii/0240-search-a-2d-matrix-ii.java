class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col= cols-1;
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        while(row<rows && col>=0){
            int curr = matrix[row][col];
            if(curr == target){
                return true;
            }
            else if(curr>target){
                col--;//move to left
            }
            else{
                row++;
            }
        }
        return false;
    }
}