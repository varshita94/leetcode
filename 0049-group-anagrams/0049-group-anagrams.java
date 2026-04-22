class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //initialize an map
        Map<String, List<String>> map = new HashMap<>();

        for(String ele : strs)
        {
            //convert into character array
            char[] arr = ele.toCharArray();
            //sort the elements in the array
            Arrays.sort(arr);
            //convert the sorted array to string for keys

            String key =  new String(arr);
            //check if the key exists in the map
            //if not then add 
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<String>());
            }

            //now add the string corresponding to their keys
            map.get(key).add(ele);

        }

        return new ArrayList<>(map.values()) ;
    }
}