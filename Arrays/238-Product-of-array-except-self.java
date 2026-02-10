/*
LeetCode 238 - Product of array except self
https://leetcode.com/problems/product-of-array-except-self/description/
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];

        arr[0] = 1;
        for(int i=1; i<nums.length; i++) {
            arr[i] = nums[i-1]*arr[i-1];
        }

        int suffix=1;
        for(int i=nums.length-1; i>=0; i--) {
            arr[i] = arr[i]*suffix;
            suffix = suffix*nums[i];
        }

        return arr;

    }
}
