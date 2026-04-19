class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, count = 0;
        int len = 0;
        for(int i=0; i<arr.length; i++)
        {
            //add the element first
            sum += arr[i];
            
            //check the conditiom
            if(i>= k-1)
            {
                if(sum/k >= threshold)
                {
                    count++;
                   
                }
              
              
                    sum -= arr[i - k +1];
                    
                
            }
        }

        return count; 
    }
}