class Solution {
      public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Integer[] numsArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(numsArray, (a, b) -> {
            int freqCompare = Integer.compare(freqMap.get(a), freqMap.get(b));
            if (freqCompare == 0) {
                return Integer.compare(b, a); 
            }
            return freqCompare;
        });

        return Arrays.stream(numsArray).mapToInt(Integer::intValue).toArray();
    }
}