class Solution {
    public int findDuplicate(int[] nums) {
        
     byte[] arr=new byte[nums.length];
       
        for(int n:nums)
        {
            if(arr[n]!=0)
        {
                return n;
        }
            arr[n]=1;
        
        }
        
        return 0;
        
    }
}