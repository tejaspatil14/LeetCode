class Solution {
    public int minimumDeletions(String s) {
       int countA = 0; 
        int ans = 0; 
        
        for (char ch : s.toCharArray()) {
            if (ch == 'b') {
                countA++;
            } 
            else  {
                
                ans = Math.min(ans + 1 ,countA);
            }
        }
        
        
        return ans;
    }
}