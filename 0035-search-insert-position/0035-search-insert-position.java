class Solution {
   
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int indexoftarget = 1;
        while(low <= high){
            int mid=(low + high)/2;
            if (nums[mid] >= target  ){
                 indexoftarget = mid;
                 high = mid - 1;
             }
             else{
               
              indexoftarget = low=mid + 1 ;
             }
        }
        return indexoftarget;    
    }
}