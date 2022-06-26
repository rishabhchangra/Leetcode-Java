class validanagram {
    public boolean isAnagram(String s, String t) {
        
        
        
  
      int[] count = new int[26];
     
        for(char c : s.toCharArray()){
            int num = c-'a';
            count[num]++;
        }
      
        for(char c : t.toCharArray()){
           int num = c-'a';
            count[num]--;
        }
        
        for(int i : count){
            if(i != 0) return false;
        }
        
        return true;
    
        
    }
            
            
            
            
}
