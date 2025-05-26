class Solution {
    public int bagOfTokensScore(int[] tokens, int p) {
        Arrays.sort(tokens);
        int max = 0;
        int i = 0;
        int j = tokens.length-1;
        int s = 0;
        while ( i <= j )
        {
            if (p >= tokens[i]){
                p = p - tokens[i++];
                s++;
                max = Math.max( s, max);
            }
            else if (s > 0 ){
                p += tokens[j--];
                s--;
            }
            else{
                break;
            }
        }
        return max;
    }
}