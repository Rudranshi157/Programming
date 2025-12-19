public class String1{

    //125. Valid Palindrome -- brute force
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for(int i =0 ; i<s.length() ;i++){
            if((s.charAt(i)>='a' && s.charAt(i) <='z') || Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        for(int i = 0 ; i<sb.length()/2 ;i++){
            if(sb.charAt(i) != sb.charAt(sb.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}