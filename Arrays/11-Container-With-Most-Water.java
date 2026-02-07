/*
LeetCode 11 - Container With Most Water
https://leetcode.com/problems/container-with-most-water/
*/

class Solution {
    public int maxArea(int[] height) {

        int max_area = 0;

        int left=0;
        int right=height.length-1;

        while(left<right) {
            int length = Math.min(height[left], height[right]);
            int width = right-left;
            int current_area = length*width;
            max_area = Math.max(max_area, current_area);

            if(height[left]<height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return max_area;

    }
}
