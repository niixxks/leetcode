class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int el = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) {
           return true; // Found a duplicate
           }
        }
        return false;
    }
      

}