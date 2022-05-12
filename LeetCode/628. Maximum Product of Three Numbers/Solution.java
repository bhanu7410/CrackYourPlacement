class Solution {
    public int maximumProduct(int[] nums) {
        
        
        int max=Integer.MIN_VALUE;
        int maxi=0;
        int min=Integer.MAX_VALUE;
        int mini=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                maxi=i;
            }
            if(nums[i]<min)
            {
                min=nums[i];
                mini=i;
            }
        }
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=secondmin)
            {
                if(i!=mini)
                {
                    secondmin=nums[i];
                }
                    
            }
        }
        
        int secondmax=Integer.MIN_VALUE;
        int smax=0;
        int thirdmax=secondmax;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>secondmax && i!=maxi){
                secondmax=nums[i];
                smax=i;}
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>thirdmax && i!=maxi && i!=smax)
                thirdmax=nums[i];
        }
        
        if(min*secondmin >= secondmax*thirdmax && max>0)
        {
            return min*secondmin*max;
        }
        else
            return secondmax*thirdmax*max;
        
    }
}