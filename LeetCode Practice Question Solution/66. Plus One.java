Difficulty - Easy


class Solution {
    // TC = O(n)
    // SC = O(n+1) 
    public int[] plusOne(int[] digits) {
        int n= digits.length;
        
        for(int i=(n-1); i>=0; i--) {
            // case 1 ( 0 to 8 )
            if( digits[i]!=9 ) {
                digits[i]++;
                break;
            } else {  // case 2 ( 9 )
                digits[i] = 0;
            }
        }

        // case 3 ( 999... )
        if( digits[0]==0 ) {
            int[] newDigits = new int[n+1]; // for ex - 1000...
            newDigits[0] = 1;
            return newDigits;   // for ex - 1000...
        }

        return digits;
    }
}
