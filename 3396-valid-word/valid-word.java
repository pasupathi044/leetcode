class Solution {
    public boolean isValid(String word) {
        int length = word.length();
        boolean sign = false;
        int vowels = 0;
        int consonants = 0;
        
         int i = 0;
        if(length<3) return false;
        while(i<length){
            if (!Character.isLetterOrDigit(word.charAt(i))) {
                return false;
                }
            
                if ("aeiouAEIOU".indexOf(word.charAt(i)) != -1) {
                    vowels++;
                } 
                else if (Character.isLetter(word.charAt(i))) {
                    consonants++;
                }
                
              i++;
        }
        if(vowels >=1 && consonants >=1){
            sign=true;
        }

        return sign;
    }
}