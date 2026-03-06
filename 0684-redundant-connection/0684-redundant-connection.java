class Solution {

    void union(int x, int y, int[] parent)
        {
            parent[x] = y;
        }

    int find(int x, int[] parent)
    {
        while(parent[x]!=-1)
        {
            x = parent[x];
        }

        return x ; // root
    }




    public int[] findRedundantConnection(int[][] edges) {
        // using disjoint sets
        // find the roots of the two nodes
        // union of the two nodes if they don't have the same root
        // if yes, then return them
        int n = edges.length;
        int[] parent = new int[n+1];
        Arrays.fill(parent, -1);

        int[] res = new int[2];

        for(int i= 0;i<n;i++)
        {
            int ru = find(edges[i][0], parent); //root
            int rv = find(edges[i][1], parent);

            if(rv == ru) {
                res[0] = edges[i][0];
                res[1] = edges[i][1];
                return res;
            }
            union(ru, rv ,parent);
           
        }

        
        return res;
        
    }
}