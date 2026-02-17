class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //brute force - O(n^2)

        //using cyclic sort - O(n)

        int n = nums.length;
        int i = 0;

        while(i<n)
        {
            //find the correct index of the element
            int correct_id = nums[i] - 1;
            //if the element is not in the correct index then swap!
            if(nums[i] != nums[correct_id])
            {
                int temp = nums[i];
                nums[i] = nums[correct_id];
                nums[correct_id] = temp;
            }
            else
            {
                i++;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(i = 0;i<n;i++)
        {
            if(nums[i]-1 != i)
            {
                res.add(i+1);
            }
        }

        return res;
        
    }
}