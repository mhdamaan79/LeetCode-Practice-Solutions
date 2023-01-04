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




class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Optimized Approach
        // TC = O(2n) ~ O(n)
        // SC = O(n)

        List<Boolean> result = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for( int i=0; i<candies.length; i++ ) {
            max = Math.max( candies[i],max );        
        }

        for( int i : candies) {    // for each loop
            result.add( i >= max - extraCandies );
        }
        return result;
    }
}


// approach -> elements @ i + extraCandies >= greatest element in candies
// which means element >= greatest elements - extraCandies 
// example : [2,3,5,1,3]
// greatest element = 5;  extraCandies = 3;
// @ i=1,   2>=5-3 ( which means true )
// on the otherhand @ i=3,   1!>=5-3 ( which mean false )
