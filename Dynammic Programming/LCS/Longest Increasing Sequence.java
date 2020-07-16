Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 

class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int t[]=new int[nums.length];
        t[0]=1;
        int maxans=1;
        for(int i=0;i<t.length;i++){
            int maxval=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    maxval=Math.max(maxval,t[j]);
                }
            }
            t[i]=1+maxval;
            maxans=Math.max(maxans,t[i]);
        }
        return maxans;
    }
}