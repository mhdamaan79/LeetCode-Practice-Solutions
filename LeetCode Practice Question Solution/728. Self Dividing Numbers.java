Difficulty - Easy


class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for( int i=left; i<=right; i++ ) {
            if( isDividing(i) ) {
                list.add(i);
            }
        }

        return list;
    }

    static boolean isDividing( int n ) {
        if( n<=0 ) {
            return false;
        }

        int rem = 0;
        int temp = n;

        while( n>0 ) {
            rem = n % 10;
            if( rem == 0 || temp % rem != 0 ) {
                return false;
            }
            n = n / 10;
        }

        return true;
    }
}
