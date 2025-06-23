class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size = s.length();
        int re =  size % k ;
        if ( re != 0){
            int ADD = k - re;
              for(int i  = 0 ; i <ADD ; i++){
                  s+= fill;
              }
        }
        int partSize = s.length()/k;
        String [] result = new String[partSize];
        for(int i = 0 ; i< partSize; i++){
        result[i] = s.substring(i * k, (i + 1) * k);
        }
        return result;
    }  
}