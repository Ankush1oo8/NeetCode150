// The area between two lines =
// area = min(height[left], height[right]) × (right - left)
// To maximize area:
// We want maximum height and maximum width.
// Width decreases as we move inward, so we must choose taller lines carefully.

class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int res=0;
        while(l<r){
            int curr=Math.min(height[l],height[r])*(r-l);
            res=Math.max(res,curr);
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }
        }
        return res;
    }
}