package recursionQuestions;

public class productOfAllDigits {
    public static void main(String[] args) {
        System.out.println(productofDigits(133));
    }
    static int productofDigits(int n){
        if (n==1){  // you can also write if (n%10==n) return n; this means if one digit return that
            return 1;
        }
        else{
            int rem=n%10;
            n=n/10;
            return rem*productofDigits(n);
        }
    }
}
