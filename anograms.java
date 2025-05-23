//My approach -26 percent faster
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer>map=new HashMap<>();
        for( char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }    
        return map.isEmpty();
    }
}


//better appraoch- 99.83 percent faster
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int arr[]=new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            if(arr[ch-'a']==0){
                return false;
            }else{
                arr[ch-'a']--;
            }
        }
        return true;
    }
}