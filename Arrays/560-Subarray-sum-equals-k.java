/*
LeetCode 560 - Subarray Sum Equals K
  https://leetcode.com/problems/subarray-sum-equals-k/description/
*?

  class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == k) {
                count++;
            }
        }

        int current_sum;

        for(int i=0; i<nums.length-1; i++) {
            current_sum = nums[i];
            for(int j=i+1; j<nums.length; j++) {
                current_sum = current_sum + nums[j];
                if(current_sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
