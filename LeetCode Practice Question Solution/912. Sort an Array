Difficulty - Medium


class Solution {
    public int[] sortArray(int[] nums) {
        // Merge Sort 
        // TC = O(nlogn)
        // SC = O(n)
        
        int n = nums.length;
        //base case
        if(nums.length==1) {
            return nums;
        }
        
        //work
        int mid = n/2;
        int[] left = sortArray(Arrays.copyOfRange(nums,0,mid));  // 0 to mid-1
        int[] right = sortArray(Arrays.copyOfRange(nums,mid,n)); // mid to n-1
        return merge(left,right);
        
    }
    
    
    public int[] merge( int[] first, int[] second ) {
        int temp[] = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<first.length && j<second.length) {
        if(first[i]<second[j]) {
            temp[k] = first[i];
            i++;
        } else {
            temp[k] = second[j];
            j++;
        }
        k++;    
        }
        
        //remaining nums in an array
        while(i<first.length) {
            temp[k++] = first[i++];
        }
        
        while(j<second.length) {
            temp[k++] = second[j++];
        }
         
      
        return temp;
        
    }
}
