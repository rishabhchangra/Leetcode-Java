class maxsubarray {
    public int maxSubArray(int[] nums) {
      
        int newNum = nums[0];
        int maxTotal = nums[0] ;       

        for (int i=1;i<nums.length;i++)
        {
            newNum = Math.max(nums[i], nums[i] + newNum);
            maxTotal = Math.max(newNum, maxTotal);
        }
        
        return maxTotal;
        
        
    }
}
