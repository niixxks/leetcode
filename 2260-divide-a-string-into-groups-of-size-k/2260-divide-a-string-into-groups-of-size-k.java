class Solution {
    public String[] divideString(String s, int k, char fill) {
       StringBuilder newString = new StringBuilder(s);
       while(newString.length()%k != 0){
         newString.append(fill);
       }
        int partSize = newString.length()/k;
        String [] result = new String[partSize];
        for(int i = 0 ; i< partSize; i++){
        result[i] = newString.substring(i * k, (i + 1) * k);
        }
        return result;
    }  
}