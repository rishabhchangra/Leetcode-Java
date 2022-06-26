class validpalindrome {
    public boolean isPalindrome(String s) {
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            
            char ch= s.charAt(i);
            // int aval=(int)ch;
            if(Character.isDigit((int)ch))  
                str.append(ch);
            else if(Character.isAlphabetic((int)ch))
                str.append(Character.toLowerCase(ch));
        }
        
        System.out.println(str);
        System.out.println(str.reverse());
        return str.toString().equals(str.reverse().toString());
           
    }
}
