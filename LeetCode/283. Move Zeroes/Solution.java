class Solution {
    public void moveZeroes(int[] nums) {
        int ptr = 0;
        int arrayIndex = 0;
        
        while (ptr < nums.length ) {
            if (nums[ptr] != 0) {
                nums[arrayIndex++] = nums[ptr];
            }
            ptr += 1;
        }
        
        while (arrayIndex < nums.length ) {
            nums[arrayIndex++] = 0;
        }
        
    }
}