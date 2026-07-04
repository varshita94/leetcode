class Solution {
    public int removeDuplicates(int[] nums) {
        int  n = nums.length;
        int max = nums[n-1];
        int left = 0, right = 0;
       
        for(left = 1; left < n;left ++)
        {
            //store the org position
            
                if(nums[right] != nums[left])
                {
                    right++;
                    nums[right] = nums[left];
                    
                   
                }
               
            }

            return right + 1;


        }

        

        
    }
