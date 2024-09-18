class Solution {
    public String largestNumber(int[] nums) {
     String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
             strNums[i] = String.valueOf(nums[i]);
            }
     
            Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        
        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
             result.append(str);
        }

            String largestNumber = result.toString();

            if (strNums[0].equals("0")) {
                 largestNumber = "0";
                }

            return largestNumber;

    }
}