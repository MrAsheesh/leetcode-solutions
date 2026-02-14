/*
Leetcode 2149 - Rearrange Array Elements By Sign
https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
*/

class Solution {
    public int[] rearrangeArray(int[] nums) {

        int arr[] = new int[nums.length];
        
        int i=0;
        int j=1;

        for(int k=0; k<nums.length; k++) {
            if(nums[k]>0) {
                arr[i] = nums[k];
                i+=2;
            }
            else{
                arr[j] = nums[k];
                j+=2;
            }
        }

        return arr;

    }
}
