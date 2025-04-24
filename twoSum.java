/*
 * first i thought i will use Array.sort() method to sort and then apply binary search to find the elementts whose sum is equal to the target
 * then after running the code i got the understanding that i can not do that as i will need to return the index of element whose sum is equal 
 * to the target and sorting can cause the loss of real index
 * then i used the hashMap to do the task
 */


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            j=target-nums[i];
            if(map.containsKey(j)){
                return new int[] {i,map.get(j)};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}