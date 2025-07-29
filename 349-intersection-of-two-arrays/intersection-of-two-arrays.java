class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> res=new HashSet<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                res.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
                j++;
        }
        int k=0;
        int[] ans=new int[res.size()];
        for(int a:res)
        {
            ans[k++]=a;
        }
        return ans;
    }
}