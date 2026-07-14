class Solution {
    public String longestCommonPrefix(String[] strs) {
        //first check whether the entire first string
        //is a common pre-fix
        String prefix = strs[0];
        if(strs.length == 0 || strs[0].isEmpty())
        {
            return "";
        }
        //iterate the array
        for(int i = 1; i < strs.length ; i++)
        {
            while(!strs[i].startsWith(prefix))
            {
                //crop the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                 if(prefix.isEmpty()) return "";
            }

           
        }

        return prefix;
    }
}