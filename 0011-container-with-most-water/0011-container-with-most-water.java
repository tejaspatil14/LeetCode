class Solution {
    public int maxArea(int[] height) {
        int lp=0;
        int rp=height.length-1;
        int maxArea=0;

        while(lp<rp){

            int ht=Math.min(height[lp] ,height[rp]);
            int width =rp-lp;
            int currWater = ht*width;
             maxArea = Math.max(maxArea, currWater);
    
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
            
        }
        return maxArea;
        
        
    }
}