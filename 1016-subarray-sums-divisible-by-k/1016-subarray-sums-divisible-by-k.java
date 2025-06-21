class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        prefix[0]= nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            prefix[i]= prefix[i-1]+nums[i];
        }
        HashMap<Integer,Integer> h = new HashMap<>();
          h.put(0,1);
          int count= 0;
          for (int j = 0 ; j < prefix.length; j++){
            int sum = ((prefix[j]%k)+k)%k;
            if (h.containsKey(sum)){
                count+=h.get(sum);
            }
           h.put(sum, h.getOrDefault(sum, 0) + 1);
          }
          return count ;
    }
}