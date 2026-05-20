class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int res[] = new int[k];
        int index = 0;
        //ele with it's frequency
        for(int ele : nums)
        {
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        for(int i = 0; i< k;i++)
        {
           int maxVal = 0;
           int maxKey = 0;
            for(int j : map.keySet())
        {
            if(map.get(j) > maxVal)
            {
                maxVal = map.get(j);
                maxKey = j;
            }
        }
        res[i] = maxKey;
        map.remove(maxKey);
        }
        
return res;
    }
}