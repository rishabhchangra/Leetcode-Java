class LC387 {
    public int firstUniqChar(String s) {
        
        
        
        if(s.length()==1)
            return 0;
        int nums[]= new int[26];
        for(int i=0; i<s.length();i++){
        
            char ch=s.charAt(i);
            int num= ch-'a';
            nums[num]++;    
        }
        
        for(int i=0; i<s.length();i++){
            
            if(nums[s.charAt(i)-'a']==1)
                return i;
            
            
        }
        
        return -1;
        
        
        }
}
