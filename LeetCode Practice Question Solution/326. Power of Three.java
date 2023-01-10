Difficulty - Easy


class Solution {
    public boolean isPowerOfThree(int n) {
        // TC  = O(log n)
        // SC = O(1)

        if( n<1 ) {
            return false;
        } 

        while( n>1 ) {
            int remainder = n % 3;
            if( remainder!=0 ) {
                return false;
            } 
            n = n/3;
        }
        
        return true;
    }
}
