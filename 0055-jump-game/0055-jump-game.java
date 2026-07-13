class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> flag = new ArrayList<>();
        flag.add(n-1);

        for(int i = n-2; i>=0; i--)
        {
            if(flag.get(0) <= i + nums[i])
            {
                flag.removeFirst();
                flag.add(i);
            }
        }

        if(flag.get(0) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}