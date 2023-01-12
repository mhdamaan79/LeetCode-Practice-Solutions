Difficulty - Easy


class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while( i<j ) {
            if( s.charAt(i) != s.charAt(j) ) {
                return isPalindrome2( s, i+1, j ) || isPalindrome2( s, i, j-1 );
            }

            i++;
            j--;
        }
        
        return true;
    }

    static boolean isPalindrome2( String s, int i, int j ) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            
            i++;
            j--;
        }

        return true;
    }
}
