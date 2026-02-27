class Solution {
    public int firstUniqChar(String s) {

        //using hashmap -> findind element with value 1 and break the loop

        HashMap<Character, Integer> map = new HashMap<>();

        //insert the characters of s in the map

        for(char c : s.toCharArray())
        {
            map.put(c , map.getOrDefault(c,0)+1);
        }

        //traversing and finding ele in the map

        for(int i =0; i<s.length();i++)
        {
            if(map.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }

        return -1;
    }
}