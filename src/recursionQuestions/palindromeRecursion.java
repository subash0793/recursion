package recursionQuestions;

public class palindromeRecursion {
    public static void main(String[] args) {
        String name="12321";
        System.out.println(isPalindrome(name, 0,name.length()-1));
    }

    private static boolean isPalindrome(String s, int start, int end) {
    if (start==end){
        return true;

    }
    else{
        if (s.charAt(start)!=s.charAt(end)){
            return false;
        }
        if (start<end+1){
            return isPalindrome(s,start+1, end-1);
        }
       return true;
    }
    }
}
