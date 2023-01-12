Difficulty - Easy


class Solution {
    public boolean isPalindrome(String s) {
        // removing alphanumeric values and converting string to lower case
       String newString = s.replaceAll( "[^A-Za-z0-9]", "" ).toLowerCase();;
       // reverse the newString
       String rev = new StringBuffer(newString).reverse().toString();
       // check the reverse String and the actual String are equals or not
       return newString.equals(rev);
    }
}
