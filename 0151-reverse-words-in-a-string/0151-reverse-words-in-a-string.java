class Solution {
    public String reverseWords(String s) {
        // Step 1: Convert string to character array for easier manipulation
        char[] chars = s.toCharArray();
        
        // Step 2: Reverse the entire string
        reverse(chars, 0, chars.length - 1);
        
        // Step 3: Reverse each word
        reverseWords(chars);
        
        // Step 4: Clean up spaces
        return cleanSpaces(chars);
    }
    
    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
    
    private void reverseWords(char[] chars) {
        int i = 0;
        int j = 0;
        
        while (j < chars.length) {
            // Find word start
            while (j < chars.length && chars[j] == ' ') j++;
            i = j;
            // Find word end
            while (j < chars.length && chars[j] != ' ') j++;
            // Reverse the word
            reverse(chars, i, j - 1);
        }
    }
    
    private String cleanSpaces(char[] chars) {
        int i = 0;
        int j = 0;
        
        while (j < chars.length) {
            // Skip leading spaces
            while (j < chars.length && chars[j] == ' ') j++;
            
            // Copy non-space characters
            while (j < chars.length && chars[j] != ' ') {
                chars[i++] = chars[j++];
            }
            
            // Skip multiple spaces
            while (j < chars.length && chars[j] == ' ') j++;
            
            // Add single space if more words exist
            if (j < chars.length) chars[i++] = ' ';
        }
        
        return new String(chars).substring(0, i);
    }
}
