Difficulty - Easy


class Solution {
    public int xorOperation(int n, int start) {
        // TC = O(N)
        // SC = O(1)
       int[]  nums = new int[n];

       int res = start;  // case : when, index = 0
       
       // for loop
       for( int i=1; i<n; i++ ) {
           nums[i] = start + 2 * i;
           res = res ^ nums[i];
       }

       return res;
    }
}
