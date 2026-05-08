class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        boolean found = false;
        int ele = 0;
        for(int i=0; i<nums1.length;i++)
        {
            found = false;
            res[i] = -1;
            ele = nums1[i];

            for(int ele2 : nums2)
            {
                if(ele == ele2 )
                {
                    found = true;
                }
                else  if(found && ele2 > ele)
                {
                    res[i] = ele2;
                    break;
                }
            }

        }

        return res;
    }
}