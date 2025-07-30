class Solution {
    public static String substr(int left,int right,String s)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
        String longest="";
        for(int i=0;i<s.length();i++)
        {
            String odd=substr(i,i,s);
            if(longest.length()<odd.length())
                longest=odd;
            String even=substr(i,i+1,s);
            if(longest.length()<even.length())
                longest=even;
        }
        return longest;
    }
}