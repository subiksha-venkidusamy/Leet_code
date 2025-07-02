class Solution {
    public int f(int ind,int buy, int[] prices,int[][] dp)
    {
        if(ind==prices.length)return 0;
        if(dp[ind][buy]!=-1)return dp[ind][buy];
        int profit=0;
        if(buy==1)
        {
            profit=Math.max((-prices[ind]+f(ind+1,0,prices,dp)),0+f(ind+1,1,prices,dp));
        }
        else
            profit=Math.max((prices[ind]+f(ind+1,1,prices,dp)),0+f(ind+1,0,prices,dp));
        return dp[ind][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] a:dp)
        {
            Arrays.fill(a,-1);
        }        
        int ans=f(0,1,prices,dp);
        return ans;
    }
}