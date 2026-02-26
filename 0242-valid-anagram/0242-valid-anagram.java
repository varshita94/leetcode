
    class Solution {
    public boolean isAnagram(String s, String t) {
        //using HashMaps
        // increment if the character is in s
        //decrement if the character is in t
        // if all the values are zero then true
        // or alternate is remove the character if present in t ..if Map is empty then TRUE

        if(s.length() != t.length())
        {
            return false;
        }

        //create a HashMap
        HashMap<Character, Integer> map = new HashMap<>();

        //add characters in map from s

        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1 );
        }

        for(char c : t.toCharArray())
        {
            if(!map.containsKey(c)) //t's character not present in the map
            {
                return false;
            }

            map.put(c,map.get(c) - 1);
        }
        
        for(int val : map.values())
        {
            if(val != 0)
            {
                return false;
            }
        }

       return true;

       
    }
}
  