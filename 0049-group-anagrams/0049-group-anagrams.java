class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
       
        //sorting the elements 
        //finding the common keys

        for(String ele : strs)
        {
            //convert to character array
            char[] arr = ele.toCharArray();
            Arrays.sort(arr);

            //convert the array back to string for the key part
            String key = new String(arr);
            if(!map.containsKey(key))
            {
                //add the string as key
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(ele);

            
        }

       return new ArrayList<>(map.values());    



    }
}