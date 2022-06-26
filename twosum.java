class twosum {
    public int[] twoSum(int[] nums, int target) {
        
        int []answer=new int[2];
        HashMap<Integer,Integer> h= new HashMap<>();
        
        
        
        for(int i=0; i<nums.length; i++ ){
  
                h.put(nums[i],i);

        }
        // System.out.println(h);
        
        for (int i=0; i<nums.length; i++){
            int value= target-nums[i];
            if(h.containsKey(value) && h.get(value)!=i){
                answer[0]=i;
                answer[1]=h.get(value);
                return answer;
            }
        }
        return answer;
    }
}
