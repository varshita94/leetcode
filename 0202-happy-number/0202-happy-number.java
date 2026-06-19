class Solution {
    public boolean isHappy(int n) {
        int num = 0;
        if (n == 1 || n == 7) return true;
        else if(n < 10) return false;
        else
        {
            int sum = 0;
            while(n > 0)
            {
                num = n % 10;
                sum += num * num;
                n = n / 10;
                
            }
             return isHappy(sum);
        }

       

    
        
    }
}