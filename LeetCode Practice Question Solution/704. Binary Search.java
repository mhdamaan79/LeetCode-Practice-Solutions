Difficulty - Easy


class Solution {
    public int search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;
        while( si<=ei ) {
            int mid = si + (ei-si)/2;
            // check mid
            if( nums[mid]==target ) {
                return mid;
            }

            // condition - 1
            if( nums[mid]>target) {
                ei = mid - 1;
            } else {  // condition - 2
                si = mid + 1;
            }
        }
        // case, target not exists
        return -1;
    }
}
