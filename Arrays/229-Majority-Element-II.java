/*
LeetCode 229 - Majority Element II
https://leetcode.com/problems/majority-element-ii/description/
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        List<Integer> list1 = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            int count=0;
            for(int j=i; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count>n/3) {
                list1.add(nums[i]);
            }
        }
        
        Set<Integer> set1 = new HashSet<>(list1);

        return new ArrayList<>(set1);
    }
}
