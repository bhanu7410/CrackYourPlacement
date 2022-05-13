class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int su = n*(n+1)/2;
        int sum=0;
        for(int x: nums){
            sum+=x;
        }
        if (sum==su){
            return 0;
        }
        return su-sum;
    }
}