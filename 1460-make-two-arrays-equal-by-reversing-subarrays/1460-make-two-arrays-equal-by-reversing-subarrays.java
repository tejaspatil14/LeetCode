class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int n=target.length;
        int m=arr.length;
        
        if(n!=m){
            return false;
        }
       Arrays.sort(target);
        Arrays.sort(arr);
 
      for(int i=0;i<n;i++){
          if(target[i]!= arr[i]){
              return false;
          }
       
         
      }
          return true; 
    }
}