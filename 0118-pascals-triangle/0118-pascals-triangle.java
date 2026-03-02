class Solution {
    public List<List<Integer>> generate(int numRows) {

        //using DP - MEMOIZATION
        List<List<Integer>> dp = new ArrayList<>();

        dp.add(Arrays.asList(1));
        

        for(int i=1 ;i<numRows ;i++)
        {
            List<Integer> current = new ArrayList<>();
            List<Integer> prev = dp.get(i-1);
            for(int j = 0;j <= i;j++)
            {
                if(j == 0 || j == i)
                {
                    current.add(1);
                }
                else{
                         current.add(prev.get(j) + prev.get(j-1));
                }
               
            }

            dp.add(current);
        }
        return dp;
    }
}