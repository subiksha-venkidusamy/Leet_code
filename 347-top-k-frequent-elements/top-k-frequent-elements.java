class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count=new HashMap<>();
        for(int a:nums)
        {
            count.put(a,count.getOrDefault(a,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> freq=new PriorityQueue<>(
            (a,b)->(b.getValue()-a.getValue()));
        freq.addAll(count.entrySet());

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = freq.poll().getKey();
        }
        
        return ans;
    }
}