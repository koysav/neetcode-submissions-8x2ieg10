class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i=0 ; i<nums.length; i++){
            int value = nums[i];
            int valueMap = hm.getOrDefault(value,0);
            hm.put(value,valueMap+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b) -> b.getValue().compareTo(a.getValue())
        );
            pq.addAll(hm.entrySet());
        int[] output = new int [k];
            for(int i=0 ; i<k; i++){
                Map.Entry<Integer,Integer> entry = pq.poll();
                    output[i]=entry.getKey();
            }
        return output;
    }
}
