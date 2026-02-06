/*
LeetCode 152 - Maximum Product Subarray
  https://leetcode.com/problems/maximum-product-subarray/description/
*?

class Solution {
    public int maxProduct(int[] nums) {
        
        int minSoFar = nums[0];
        int maxSoFar = nums[0];
        int result = nums[0];

        for(int i=1; i<nums.length; i++) {

            if(nums[i] < 0) {
                int temp = minSoFar;
                minSoFar = maxSoFar;
                maxSoFar = temp;
            }

            minSoFar = Math.min(nums[i], minSoFar*nums[i]);
            maxSoFar = Math.max(nums[i], maxSoFar*nums[i]);

            result = Math.max(result, maxSoFar);
        }

        return result;

    }
}
