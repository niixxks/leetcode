class Solution {
    //  public int found( int []nums , int target){
    //      int l = 0;
    //     int r = nums.length-1;
    //     while(l<r){
    //         int mid=(l+r)/2;
    //         if (nums[mid]==target) return mid;
    //         else if(nums[mid]<target) {
    //                l=mid+1;
    //          }
    //          else{
    //             r=mid;
    //          }

    //     }
    //     return -1;     
    // }
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int ans=1;
        while(l<=r){
            int mid=(l+r)/2;
            if (nums[mid]>=target  ){
                 ans= mid;
                 r=mid-1;
             }
             else{
               
              ans= l=mid+1 ;
             }
        }
        return ans;    
    }
}