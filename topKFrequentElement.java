/*
 *  so I misunderstood the question i thought it was element with k or more than k frequency but i was wrong 
 * it top k elements with max frequency
 * it was simple made hash map made key value pairs of key and frequency
 * then mad an arraylist sorted the element on the basis of frequency
 * then tranfered it to the array of length k 
 */

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>array=new ArrayList<>(map.keySet());
        Collections.sort(array,(a,b)->map.get(b)-map.get(a));
        int list []=new int [k];
        for(int i=0;i<k;i++){
            list[i]=array.get(i);
        }
        return list;
    }
}

//there was also a different way to sort as i can use priority queue to sort the elementl