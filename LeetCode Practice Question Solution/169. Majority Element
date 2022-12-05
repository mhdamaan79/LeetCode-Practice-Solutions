Difficulty - Medium


class Solution {
    public int majorityElement(int[] nums) {
        // TC = (nlogn)
        // SC = (1)
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
}





class Solution {
    public int majorityElement(int[] nums) {
        // TC = (n)
        // SC = (1)
        // Moore's Voting Algorithm
        int n = nums.length;
        int candidate = nums[0];
        int vote = 1;
        
        for(int i=1;i<n;i++) {
            if( candidate == nums[i] ) {
                vote++;
            } else {
                vote--;
                if( vote==0 ) {
                    candidate = nums[i];
                    vote = 1;
                }
            }
        }
        return candidate;
    }
}
