class Solution {
    public int[][] merge(int[][] intervals) {
        //[[1,3],[2,6],[8,10],[15,18]]
        int n = intervals.length;
        //first sort the array based on the starting intervals
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        //now store the initial interval as prev
        int[] prev = intervals[0];

        for(int i =1; i < n;i++)
        {
            int[] next = intervals[i];
            if(prev[1] >= next[0])
            {
                //they overlap sp merge
                prev[1] = Math.max(prev[1], next[1]);
                

            }
            else
            {
                ans.add(prev);
               prev = next;
            }
          
        }
        ans.add(prev);
       

        return ans.toArray(new int[ans.size()][]);
    }
}