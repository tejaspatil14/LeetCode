class Solution {
    public int jump(int[] nums) {
           int n = nums.length;
        if (n <= 1) {
            return 0;
        }

        int jumps = 0;
        int currentMax = 0;
        int nextMax = 0;

        for (int i = 0; i < n - 1; i++) {
            nextMax = Math.max(nextMax, i + nums[i]);

            if (i == currentMax) {
                jumps++;
                currentMax = nextMax;

                if (currentMax >= n - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}