class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int left=0,right=nums.length-1;
        int pos=right;
        while(left<=right)
        {
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
            if(leftsq>rightsq)
            {
                res[pos]=leftsq;
                left++;
            }
            else
            {
                res[pos]=rightsq;
                right--;
            }
            pos--;
        }
        return res;
    }
}