class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] temp = new int[nums.length];
        int l=0;
        int r= nums.length-1;
        int idx=r;
        while(l<=r){
            int leftsquare=nums[l]*nums[l];
            int rightsquare=nums[r]*nums[r];
            if(leftsquare > rightsquare){
                temp[idx--] = leftsquare;
                l++;
            }
            else{
                temp[idx--] = rightsquare;
                r--;
            }
        }
        return temp;
    }
}