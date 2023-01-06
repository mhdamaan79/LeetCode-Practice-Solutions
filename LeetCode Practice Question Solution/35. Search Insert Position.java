Difficulty - Easy


class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int si = 0;
        int ei = nums.length-1;
        while( si<=ei ) {
            int mid = si + (ei-si)/2;
            // taget found
            if( nums[mid] == target ) {
                return mid;
            } else if( target<nums[mid]) {
                ei = mid-1;
            } else {
                si = mid+1;
            }
        }
        return si;  // @ nums.length index  i.e.,  nums[nums.length]
    }
}
