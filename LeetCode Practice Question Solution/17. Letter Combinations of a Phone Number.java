Difficulty - Medium


class Solution {
    public List<String> letterCombinations(String digits) {
        String[] alpha = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> list = new ArrayList<>();
        if(digits.length()==0)
        {
            return list;
        }

        // function call
        combinations(list, alpha, digits, "");
        return list;
    }

    static List<String> combinations( List<String> list, String[] alpha, String digits, String ans ) {
        // base case
        if( digits.isEmpty() ) {
            list.add(ans);
            return list;
        }

        int digit = digits.charAt(0) - '0';   // convert '2' into 2
        String range = alpha[digit];

        for( int i=0; i<range.length(); i++ ) {
            combinations( list, alpha, digits.substring(1), ans + range.charAt(i) );
        }

        return list;
    }
}
