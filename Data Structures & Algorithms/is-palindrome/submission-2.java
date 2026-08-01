class Solution {
    public boolean isPalindrome(String s) {
        int i = 0; 
        int j = s.length() - 1;
        s = s.toLowerCase();

        while(i < j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(alphabet_or_num(c1) == false){
                i++;
                continue;
            }
            if(alphabet_or_num(c2) == false){
                j--;
                continue;
            }
            if(c1 != c2){
                return false;  
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean alphabet_or_num(char c){
        return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9');
    }
}
