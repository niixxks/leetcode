class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
         ArrayList <Integer> j = new ArrayList<>();
         for ( int i = 0 ; i < nums.length ; i++){
             if ( nums[i] == key){
                j.add(i);
             }
         }ArrayList <Integer> ans = new ArrayList<>();
         for ( int t = 0 ; t< nums.length ; t++){
            for ( int idx : j){
            if(Math.abs( t - idx)<= k ){
                ans.add(t);
                break;
             }
          }
         }
         return ans;
    }
}