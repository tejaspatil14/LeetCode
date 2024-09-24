class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
         List<String> result = new ArrayList<>();
         result.add(words[0]);
        
        int lastGroup = groups[0];
        
        for (int i = 1; i < words.length; i++) {
            if (groups[i] != lastGroup) {
                result.add(words[i]);  
                lastGroup = groups[i]; 
            }
        }
        
        return result;
    }
}