/*
 * Question: Sort Colors (LeetCode #75)
 * Approach:- 1.) (Counting Sort): It counts the occurrences of 0s, 1s, and 2s in the first pass and then overwrites the array in the second pass.
 *            2.) (3-Pointer/DNF): It uses three pointers to sort the array in a single pass by swapping elements into their correct positions as it traverses.
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class Q009_SortColors_Medium {
    private static void swap(int[] nums, int a, int b) {
       int temp = nums[a];
       nums[a] = nums[b];
       nums[b] = temp;
    }
    public static void sortColors(int[] nums) {
      // ----------------- 2nd Approach (Dutch National Flag Algorithm) -------------------------
        int n = nums.length;
        int mid = 0, high = n-1, low = 0;
        while (mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                mid++; low++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

        // ----------------- 1st Approach -------------------------
        // int zero = 0;
        // int ones = 0;
        // int twos = 0;
        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i] == 0) zero++;
        //     else if(nums[i] == 1) ones++;
        //     else twos++;
        // }
        // int idx = 0;
        // for(int i=0; i<zero; i++) {
        //     nums[idx++] = 0;
        // }
        // for(int i=0; i<ones; i++) {
        //     nums[idx++] = 1;
        // }
        // for(int i=0; i<twos; i++) {
        //     nums[idx++] = 2;
        // } 
        // O(n)
    }
}
