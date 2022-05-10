
class Solution {
    public void sortColors(int[] nums) {
        int right =nums.length-1;
        int left = 0;
        int i=0;
        while(i<=right){
            int temp=0;
            if (nums[i]==0){
                temp = nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
                i++;
            }
            else if (nums[i]==2){
                temp = nums[i];
                nums[i]=nums[right];
                nums[right]=temp;
                right--;
            }
            else{
                i++;
            }
        }
    }
}