class Solution {
    public int countCompleteDayPairs(int[] hours) {
         Map<Integer,Integer>mp=new HashMap<>();
        int ans=0;
         for(int i=0;i<hours.length;i++)
         {
             int remainder=hours[i]%24;
             if(remainder==0)
             {
                ans+=mp.getOrDefault(0,0);
             }
             else{
                ans+=mp.getOrDefault(24-remainder,0);
             }
             mp.put(remainder, mp.getOrDefault(remainder, 0) + 1);
         }
         return ans;
    }
}