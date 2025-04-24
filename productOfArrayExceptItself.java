/*
 * first when i used my brain for a sec i did not read the question fully
 * so i used simple method to give the array
 * first multiply all the element then divised by ith element to give the element of ith position
 * but then i saw theere are also zeros in input and the solution was fucked
 */

 class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        Arrays.fill(result, 1); // Optional, since we're setting values manually

        int pre = 1; // Product from the left
        for (int i = 0; i < nums.length; i++) {
            result[i] = pre;
            pre *= nums[i];
        }

        int post = 1; // Product from the right
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= post;
            post *= nums[i];
        }

        return result;
    }
}
