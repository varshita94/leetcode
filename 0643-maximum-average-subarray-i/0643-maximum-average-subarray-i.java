class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //using fixed sliding window
        int n = nums.length;
        //calculate the sum of first k elements
        double sum=0,max_sum = 0;

        for(int i=0; i<k ;i++)
        {
            sum += nums[i];
        }

        max_sum = sum;

        for(int i = 0;i<n-k;i++)
        {
            //subtract the element leaving the window
            sum -= nums[i];
            //add the element entering the array
            sum += nums[i+k];
            

            max_sum = Math.max(max_sum , sum);
        }

        return max_sum/k;
    }
}