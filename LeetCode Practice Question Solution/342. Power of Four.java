Difficulty - Easy


class Solution {
    public boolean isPowerOfFour(int n) {
        // TC  = O(log n)
        // SC = O(1)

        if( n<1 ) {
            return false;
        } 

        while( n>1 ) {
            int remainder = n % 4;
            if( remainder!=0 ) {
                return false;
            } 
            n = n/4;
        }
        
        return true;
    }
}
