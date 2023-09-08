class Solution {
    public boolean isPalindrome(String s) {
        
        if( s.isEmpty()){
            return true;
        }
        int lp=0;
       int rp = s.length() - 1;


        while(lp<=rp){

            char lc =s.charAt(lp);
            char rc =s.charAt(rp);

            if(!Character.isLetterOrDigit(lc)){
                lp++;
                
            }else if(!Character.isLetterOrDigit(rc)){
                    rp--;
                }else{
                    if (Character.toLowerCase(lc) != Character.toLowerCase(rc)) {
                    return false;
                }
                lp++;
                rp--;
                }
        }
        return true;
    }
}