class Solution {
    boolean ok(int a, int b)
    {
        if(a == b)return true;
        String A = "" + a;
        String B = "" + b;
        int m = Math.max(A.length(), B.length());
        while(A.length() < m)A = "0" + A;
        while(B.length() < m)B = "0" + B;

        char[] s = A.toCharArray();
        char[] t = B.toCharArray();
        for(int i = 0;i < s.length;i++){
            for(int j = i+1;j < s.length;j++){
                {char d = s[i]; s[i] = s[j]; s[j] = d;}
                if(Arrays.equals(s, t))return true;
                {char d = s[i]; s[i] = s[j]; s[j] = d;}
            }
        }
        return false;
    }

    public int countPairs(int[] nums) {
        int n = nums.length;
        int ct = 0;
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(ok(nums[i], nums[j])){
                    ct++;
                }
            }
        }
        return ct;
    }
}