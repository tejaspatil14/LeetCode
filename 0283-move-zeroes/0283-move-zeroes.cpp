class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int left = 0;  // points to zero element
        int right = 0; // points to non-zero element
        
        while(right < nums.size()) {
            if(nums[right] != 0) {
                swap(nums[left], nums[right]);
                left++;
            }
            right++;
        }
    }
};
