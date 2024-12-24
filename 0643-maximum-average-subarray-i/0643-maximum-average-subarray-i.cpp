class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int sum = 0;
        
        // Calculate initial sum of first k elements
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int maxSum = sum;
        
        // Slide window and update maxSum
        for(int i = k; i < nums.size(); i++) {
            sum += nums[i] - nums[i - k];
            maxSum = max(maxSum, sum);
        }
        
        // Return average by converting maxSum to double
        return static_cast<double>(maxSum) / k;
    }
};
