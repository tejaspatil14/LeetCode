class Solution {
   public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;

        // Array to store mapped values and their original indices
        int[][] mappedWithIndex = new int[n][2];

        for (int i = 0; i < n; ++i) {
            int originalNum = nums[i];
            int mappedNum = 0;
            int placeValue = 1;

            // If the number is 0, map it directly
            if (originalNum == 0) {
                mappedNum = mapping[0];
            } else {
                // Build the mapped number by mapping each digit
                StringBuilder mappedBuilder = new StringBuilder();
                while (originalNum > 0) {
                    int digit = originalNum % 10;
                    mappedBuilder.append(mapping[digit]);
                    originalNum /= 10;
                }
                // Reverse the mapped number to get the correct order
                mappedNum = Integer.parseInt(mappedBuilder.reverse().toString());
            }

            mappedWithIndex[i] = new int[]{mappedNum, i};
        }

        // Sort by mapped number, then by original index if mapped numbers are equal
        Arrays.sort(mappedWithIndex, (a, b) -> 
            a[0] == b[0] ? a[1] - b[1] : Integer.compare(a[0], b[0])
        );

        // Create the result array
        int[] sortedArray = new int[n];
        for (int i = 0; i < n; ++i) {
            sortedArray[i] = nums[mappedWithIndex[i][1]];
        }

        return sortedArray;
    }

}