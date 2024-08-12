class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        // Initialize the variables to track the minimum string after swaps
        String minString = s;
        
        // Try all possible adjacent swaps with the same parity
        for (int i = 0; i < n - 1; i++) {
            if ((arr[i] % 2) == (arr[i + 1] % 2)) {
                // Swap the characters
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                
                // Update the minimum string if the new string is smaller
                String newString = new String(arr);
                if (newString.compareTo(minString) < 0) {
                    minString = newString;
                }
                
                // Swap back to try other possibilities
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        
        return minString;
    }
}
