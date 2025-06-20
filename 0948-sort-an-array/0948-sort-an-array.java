class Solution {
    public void sort( int l , int r,int[] nums){
        if (l>=r) return ;
        int q= (l+r)/2;
        sort(l,q,nums);
        sort(q+1,r,nums);
        merge(l,q,r,nums);
    }
    public void merge( int l , int q, int r , int [] nums){
             List<Integer> temp = new ArrayList<>();
             int Left = l;
             int Right = q+1;
             while(Left <= q && Right <= r){
             if (nums[Left]<= nums[Right]){
                temp.add(nums[Left]);
                Left++;
             }
             else{
                temp.add(nums[Right]);
                Right++;
             }
             }
             while(Left<=q){
                temp.add(nums[Left]);
                Left++;
             }
             while(Right<= r){
                temp.add(nums[Right]);
                Right++;
             }
             for( int i = l ; i <= r ; i++ ){
                nums[i]= temp.get(i - l);
             }
             

    }
    public int[] sortArray(int[] nums) {
        
         sort( 0 , nums.length-1 ,nums);
         return nums;
        //for (int i = 1; i < nums.length ; i++){
           
            //Insertion sort
            // int key = nums[i];
            // int j= i-1;
            // while(j> -1 && nums[j]>key){
            //     nums[j+1] = nums[j];
            //     j=j-1; 
            // }
            // nums[j+1]=key;
            
            //bubble sort
            // int l=0;
            // int r=nums.length -i-1;
            // while(l<r){
            //     if (nums[l] > nums[l+1]){
            //         int temp= nums[l];
            //         nums[l]= nums[l+1];
            //         nums[l+1] = temp;
            //     }
            //     l++;
            // }
        ///selction sort 
        //      int min = nums[i];
        //       int count = i;
        //     for(int j = i+1 ; j<nums.length; j++){
        //         if ( min > nums[j]){
        //             min=nums[j];
        //             count =j;
        //         }
        //     }
        //     int temp = nums[i];
        //     nums[i]= nums[count];
        //     nums[count]= temp;

        //
         //}
        // return nums;
    }
}