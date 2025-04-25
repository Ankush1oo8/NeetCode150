/*
 * I have solved this previously but didnot get it again at first then i saw my previous solution and take a hint of HashSet
 * also in while loop i thought of removingelement which are already part of sequence but it caused an error 
 */


class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max=0;
        for(int i:set){
            int cnt=1;
            if(!set.contains(i-1)){
                int x=i+1;
                while(set.contains(x)){
                    x+=1;
                    cnt++;
                }
                max=Math.max(max,cnt);
            }
        }
        return max;

    }
}