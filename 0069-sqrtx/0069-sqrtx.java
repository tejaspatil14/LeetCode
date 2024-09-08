class Solution {
    public int mySqrt(int x) {
        long low=1,high=x;
        int ans=0;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if((mid*mid)>x)
            {
               
                high=mid-1;
            }
            else
            {
                ans=(int)mid;
                low=mid+1;
            }
        }
        return ans;
    }
}