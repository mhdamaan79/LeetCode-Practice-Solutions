Difficulty - Easy


class Solution {
    public String restoreString(String s, int[] indices) {
        // TC = O(n)
        int n = s.length();
        char[] ch = new char[n];
        for( int i=0; i<n; i++ ) {
            ch[ indices[i] ] = s.charAt(i);
        }
        
        String str = "";
        for( int i=0; i<ch.length; i++ ) {
            str += ch[i];
        }

        return str;
    }
}




// Using StringBuilder

class Solution {
    public String restoreString(String s, int[] indices) {
        // Using StringBuilder
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for( int i=0; i<n; i++ ) {
            sb.setCharAt( indices[i] , s.charAt(i) );
        }
        
        return sb.toString();
    }
}
