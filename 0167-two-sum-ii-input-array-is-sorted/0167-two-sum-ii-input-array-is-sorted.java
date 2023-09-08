class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int lp =0;
        int rp=n - 1;
         while(lp<rp){
          
                 if(numbers[lp]+numbers[rp]==target){
                     return new int[]{lp+1,rp+1};
                 } else if(numbers[lp]+numbers[rp]<target){
                     lp++;
                 } else{
                     rp--;
                 }
         }
         return new int[]{-1,-1};

    }
}