class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        int max_units = 0;
        int n = boxTypes.length;
        //using greedy approach
        // logic here
        // be greedy - consider the boxes with highest units
        // so sort
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);

        //so we sorted the array with max units at the top
        int [] boxes = new int[n];
        int [] units = new int[n];
        for(int i = 0;i < n;i++)
        {
          boxes[i] = boxTypes[i][0];
          units[i] = boxTypes[i][1];    
        }
        
        //for each box
        int rem = truckSize;
        int i = 0;
        while(i < boxes.length && rem >= 0)
        {
            if(boxes[i] <= rem)
            {
                //add the units
                max_units += boxes[i] * units[i];
                rem -= boxes[i]; 
                i++;
            }
            else
            {
                max_units += rem * units[i];
                rem = 0;
                break;
            }

        }

        return max_units;
    }
}