class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Concatenate both sentences
        String s = s1 + " " + s2;
        
        // Create a map to count the occurrences of each word
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Split the sentences into words
        String[] words = s.split(" ");
        
        // Count the occurrences of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Create a list to store uncommon words (those that appear only once)
        List<String> result = new ArrayList<>();
        
        // Find the words that appear exactly once
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        // Convert the list to an array and return it
        return result.toArray(new String[0]);
    }
}
