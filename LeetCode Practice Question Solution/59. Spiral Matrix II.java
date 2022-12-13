Difficulty - Medium


class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;         
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while( startRow<=endRow && startCol<=endCol ) {
            for(int j=startCol;j<=endCol;j++) {
                matrix[startRow][j] = count;
                count++;
            }

            for(int i=startRow+1;i<=endRow;i++) {
                matrix[i][endCol] = count;
                count++;
            }

            for(int j=endCol-1;j>=startCol;j--) {
                if(startRow==endRow) {
                    break;
                }
                matrix[endRow][j] = count;
                count++;
            }

            for(int i=endRow-1;i>=startRow+1;i--) {
                if(startCol==endCol) {
                    break;
                }
                matrix[i][startCol] = count;
                count++;
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return matrix;
    }
}
