Difficulty - Easy


class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int p = -1;

        for( int i=0; i<n; i++ ) {
            // even case
            if( nums[i]%2==0 ) {
                p++;
                ans[p] = nums[i];
            }
        }

         for( int i=0; i<n; i++ ) {
            // odd case
            if( nums[i]%2==1 ) {
                p++;
                ans[p] = nums[i];
            }
        }

        return ans;
    }
}
