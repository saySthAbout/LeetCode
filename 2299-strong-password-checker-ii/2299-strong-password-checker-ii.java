class Solution {
    public boolean strongPasswordCheckerII(String password) {
        // It has at least 8 characters.
        if(password.length() < 8){
            return false;
        }
        
        int temp = 0;
        int nextTemp = 0;
        boolean lowercaseFlag = false;
        boolean uppercaseFlag = false;
        boolean digitFlag = false;
        boolean specialCharFlag = false;
        
        
        for(int i=0; i<password.length(); i++){
            temp = password.charAt(i);
            
            // It contains at least one lowercase letter.
            if(!lowercaseFlag && temp > 96 && temp < 123){
                lowercaseFlag = true;
            }
            
            // It contains at least one uppercase letter.
            if(!uppercaseFlag && temp > 64 && temp < 91){
                uppercaseFlag = true;
            }
            
            // It contains at least one digit.
            if(!digitFlag && temp > 47 && temp < 58){
                digitFlag = true;
            }
            
            // It contains at least one special character.
            if(!specialCharFlag && (temp == 33 || temp == 35 || temp == 36 || temp == 37 || temp == 38 || temp == 40 
                || temp == 41 || temp == 42 || temp == 43 || temp == 45 || temp == 64 || temp == 94)){
                specialCharFlag = true;
            }
            
            if(i<password.length()-1){
                nextTemp = password.charAt(i+1);
                if(temp - nextTemp == 0){
                    return false;
                }
            }
        }
        
        if(!lowercaseFlag || !uppercaseFlag || !digitFlag || !specialCharFlag){
            return false;
        }else{
            return true;
        }
    }
}