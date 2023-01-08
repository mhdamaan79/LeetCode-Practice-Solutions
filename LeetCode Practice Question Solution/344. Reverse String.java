Difficulty - Easy


// Iterative Methode

class Solution {
    public void reverseString(char[] s) {
       int si = 0;
       int ei = s.length-1;

       while( si<ei ) {
           //swap
           char temp = s[si];
           s[si] = s[ei];
           s[ei] = temp;
           si++;
           ei--;
       }
    }
}




// Recursive Methode

class Solution {
    public void reverseString(char[] s) {
       recursive( s, 0, s.length-1 );
    }

    static void recursive( char[] s, int si, int ei ) {
        // base case
       if( si > ei ) {
           return;
       }

        // swapping
       char temp = s[si];
       s[si] = s[ei];
       s[ei] = temp;

       // recursive call
       recursive( s, si+1, ei-1 );
    }
}
