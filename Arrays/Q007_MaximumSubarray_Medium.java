/**
 * Question: Maximum Subarray (LeetCode #53)
 * Approach:- This code implements Kadane’s Algorithm, which finds the maximum subarray sum by iteratively adding elements and resetting the current sum to zero whenever it drops below zero to ensure we only carry forward a positive contribution.
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class Q007_MaximumSubarray_Medium {
    public static int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            currSum += nums[i];
            if(currSum > maxSum) maxSum = currSum;
            if(currSum < 0) currSum = 0;
        }
        return maxSum;
    }
}
