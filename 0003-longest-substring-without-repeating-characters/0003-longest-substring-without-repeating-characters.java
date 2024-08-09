class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int result = 0;
        int left = 0, right = 0;
        
         HashSet<Character> set = new HashSet<>();        
        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                result = Math.max(result, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        
        return result;
        
    }
}