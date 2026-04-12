class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        int res[]=new int[n-k+1];int j=0;
        for(int i=0;i<n;i++){
            if(i>=k && dq.getFirst()<=i-k)dq.pollFirst();
            while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.pollLast();
            }
            dq.add(i);
            if(i>=k-1)res[j++]=nums[dq.getFirst()];
        }
        return res;
    }
}