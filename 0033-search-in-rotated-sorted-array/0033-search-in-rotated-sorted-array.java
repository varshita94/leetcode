class Solution {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int ele : nums)
        {
            map.put(ele,index);
            index++;
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