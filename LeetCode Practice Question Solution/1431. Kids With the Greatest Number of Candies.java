Difficulty - Easy


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Brute Force Approach
        // TC = O(n^2)
        // SC = O(n)

        List<Boolean> result = new ArrayList<>();
        
        for( int i=0; i<candies.length; i++ ) {
            boolean test = false;
            for( int j=0; j<candies.length; j++ ) {
                // condition check
                if( candies[i]+extraCandies < candies[j] ) {
                    test = true;
                    break;
                }
            }

            if(test) {
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;
    }
}
