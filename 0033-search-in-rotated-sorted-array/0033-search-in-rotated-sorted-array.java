class Solution {
    public int search(int[] nums, int target) {
        //using hash map

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int ele : nums) {
            map.put(ele, count);
            count++;
        }

        if(map.containsKey(target))
        {
            return map.get(target);
        }
        else
        {
            return -1;
        }
    }
}