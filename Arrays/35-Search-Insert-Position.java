/*
LeetCode 35 - Search Insert Position
https://leetcode.com/problems/search-insert-position/description/
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==target || nums[i]>target) {
                index = i;
                break;
            }
            else {
                index = nums.length;
            }
        }
        return index;
    }
}
