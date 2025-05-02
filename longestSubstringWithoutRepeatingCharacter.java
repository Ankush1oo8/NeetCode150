/*
 * hashset and hashmap are best data structures
 * once got the appraoch dont need to watch the solution
 * simple remove and add and move on
 */

 class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int len=0;
        HashSet<Character>set=new HashSet<>();
        while(r<s.length()){
                while(l<r && set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                        l++;
            }
             set.add(s.charAt(r));
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}