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
