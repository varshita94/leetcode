class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] clone = arr.clone();

        Arrays.sort(clone);
        int c = 1;
        for(int ele : clone )
        {
            if(!map.containsKey(ele))
            {
            map.put(ele, map.getOrDefault(ele, 0) + c );
            c++;
            }
           
        }
        int i = 0;
        for(int ele : arr)
        {
            arr[i] = map.get(ele);
            i++;

        }
        return arr;
    }
}