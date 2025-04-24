/*
 * OKEY SO I SAW THE SOLUTION 
 * understood it
 * there are somethings that where quite out of mind like
 * converted the string to array -> sorted it -> again converted it to string
 * check if sorted string was in hashmap then added the word in response to that key which is sortedword
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char[] chars=(s.toCharArray());
            Arrays.sort(chars);
            String sortedword=new String(chars);
            if(!map.containsKey(sortedword)){
                map.put(sortedword,new ArrayList<>());
            }
            map.get(sortedword).add(s);
        }
        return new ArrayList<>(map.values());
    }
}