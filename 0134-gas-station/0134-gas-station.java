class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int n = gas.length;
     int tank =0;
     int start=0;
     int total=0;
     for (int i = 0; i<n ;i++){
        int curr=gas[i]-cost[i];
        tank+=curr;
        total+=curr;
        if (tank<0){
              start =i+1;
              tank=0;
        }
     }
     return total >= 0 ? start : -1;   
    }
}