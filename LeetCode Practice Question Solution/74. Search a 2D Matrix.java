Difficulty - Medium


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int startRow = 0, startCol = matrix[0].length-1;
        
        while( startRow<matrix.length && startCol>=0) {
            if( matrix[startRow][startCol]==target ) {
                return true;
            }
            else if( matrix[startRow][startCol] < target ) {
                startRow++;
            } else {
                startCol--;
            }
        }
        return false;
    }
}
