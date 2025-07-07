class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
        int count=0;
        for (int num: nums){
            if (num ==1) {
                count++;
               maxcount = Math.max(maxcount , count);
            }
            
            else{
                count =0;
            }    
        }
        return maxcount;
    } 
}