package midtermreviewcodeforpartc;

class PasswordValidator extends User{
    
    private int minLet = 0; // Minimum amount of letters needed for valid password
    private int minNum = 0; // Minimum amount of numbers needed for valid password
    private int minSpec = 1; // Minimum amount of special characters needed for valid password
    private int minLen = 8; // Minimum length of password needed for valid password
    
    public PasswordValidator(String pass) {
        setPassword(pass);
    }

    public int getMinLet() {
        return minLet;
    }

    public void setMinLet(int minLet) {
        this.minLet = minLet;
    }

    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public int getMinSpec() {
        return minSpec;
    }

    public void setMinSpec(int minSpec) {
        this.minSpec = minSpec;
    }

    public int getMinLen() {
        return minLen;
    }

    public void setMinLen(int minLen) {
        this.minLen = minLen;
    }
    
    public boolean validPass() {
        
        int num = 0, let = 0, spec = 0;
        String pass = getPassword();
        
        if(pass.length() >= minLen) { // Will only check chars when length requirement is met
            
            for(int i = 0; i < pass.length(); i++) {
                
                char c = pass.charAt(i);
                if(Character.isDigit(c))
                    num++;
                else if(Character.isLetter(c))
                    let++;
                else
                    spec++;
            }
            return num >= minNum && let >= minLet && spec >= minSpec;
        }
        return false;
    }
    
}
