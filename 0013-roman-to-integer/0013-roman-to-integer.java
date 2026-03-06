class Solution {
    public int romanToInt(String s) {
        // if the current number is less than the next number then subtract
        //else add

        //using a hash map to store the current given values

        Map<Character, Integer> map = Map.of(
        'I' ,  1,
        'V'  , 5,
        'X'  ,10,
        'L'  ,50,
        'C'  ,100,
        'D'  ,500,
        'M'  ,1000);
        //looping thru the input string
        int res = 0;
        int n = s.length();
        for(int i=0;i<n-1;i++)
        {
            int curr = map.get(s.charAt(i));
            int next = map.get(s.charAt(i+1));

            if(curr < next)
            {
                res -= curr;
            }
            else
            {
                res += curr;
            }
        }
    return res+map.get(s.charAt(n-1));  //adding the last character's value
    }
}