class LC344reversestring {
    public void reverseString(char[] s) {
        
        
        int n=s.length;
        for(int i=0; i<n/2; i++){
            
            char back=s[n-i-1];
            char front=s[i];
            
            s[i]=back;
            s[n-i-1]=front;
    
        }
        
        
    }
}
