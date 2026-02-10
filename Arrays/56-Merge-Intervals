/*
LeetCode 56 - Merge Intervals
https://leetcode.com/problems/merge-intervals/description/
*/

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        ArrayList<int[]> arr = new ArrayList<>();

        for(int[] x: intervals) {
            if(arr.isEmpty() || arr.get(arr.size()-1)[1]<x[0]) {
                arr.add(x);
            }
            else {
                arr.get(arr.size()-1)[1]=Math.max(arr.get(arr.size()-1)[1], x[1]);
            }
        }
        //Way to converting arraylist into array
        return arr.toArray(new int[arr.size()][]);
    }
}
