Difficulty - Easy


class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int[] row : image ) {
            // reverse this array
            for(int j=0; j< (image[0].length+1)/2 ;j++) {
                // swap
                int temp = row[j] ^ 1;
                row[j] = row[image[0].length-j-1] ^ 1;
                row[image[0].length-j-1] = temp;
            }
        }
        return image;
    }
}
