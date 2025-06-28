class Solution {
    public int[] plusOne(int[] digits) {
       int s = digits.length-1;
       int [] res = new int[s+2];
       for(int i= s ; i>=0; i-- ){
           if(digits[i]<9){
            digits[i]++;
            return digits;
           }
           digits[i]=0;
       }
       res[0]=1;
       return res;
    }
}