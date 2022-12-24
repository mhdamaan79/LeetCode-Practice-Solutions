Difficulty - Easy


class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int n, int steps) {
        if( n==0 ) {
            return steps;
        }

        if(n%2==0) {  // even case
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);  // odd case
    }
}
