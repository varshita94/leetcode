class Solution {
    public boolean canFinish(int n, int[][] prq) {
        // we can take all courses - if there aren't any loops
        int ind[] = new int[n], c= 0;  //indegree
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       for(int i = 0;i<n;i++) adj.add(new ArrayList<Integer>());
        for(int i = 0;i<prq.length;i++)
        {
            ind[prq[i][0]]++;
            adj.get(prq[i][1]).add(prq[i][0]);
        }
            ArrayDeque<Integer> q = new ArrayDeque<>();
            for(int i=0;i<n;i++)
            {
                if(ind[i] == 0) q.add(i);
            }

            if(q.isEmpty()) return false;
            
            while(!q.isEmpty())
            {
                int x = q.pollFirst();
                c++;
                for(int k:adj.get(x))
                {
                    ind[k]--;
                    if(ind[k] == 0) q.add(k);
                }
            }

            return c == n;
        }
    }
