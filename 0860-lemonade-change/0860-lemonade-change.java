class Solution {
    public boolean lemonadeChange(int[] bills) {
     int five_dollar = 0, ten_dollar = 0;

     for(int amt : bills)
     {
        if(amt == 5)
        {
            five_dollar++;
        }

        else if(amt == 10)
        {
            //need to increment 10-dollar bill and decrement 5-dollar
            if(five_dollar > 0)
            {
                five_dollar--;
                ten_dollar++;
            }
            else
            {
                return false;
            }
            
        }
        else if(amt == 20)
        {
            if(five_dollar > 0 && ten_dollar > 0)
            {
                five_dollar--;
                ten_dollar--;
            }
            else if(five_dollar > 2) // 5+5+5
            {
                five_dollar -= 3;
            }
            else
            {
                return false;
            }
        }
     }

     return true;   
    }
}