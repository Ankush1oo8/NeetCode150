/*
 * At every index i, the water trapped =
 * min(leftMax, rightMax) - height[i]
 * Where:
 * leftMax = maximum height of bars to the left of i (including i)
 * rightMax = maximum height of bars to the right of i (including i)
 * If there is no taller bar on both sides, no water is trapped.
 */

class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        // Fill leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        
        // Fill rightMax array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        
        // Calculate total trapped water
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        return sum;
    }
}
