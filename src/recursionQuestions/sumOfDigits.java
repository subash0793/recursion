package recursionQuestions;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342));
    }
    static int sumOfDigits(int n){
        if (n==0){
            return 0;
        }
        int rem=n %10;
        n=n/10;
        return rem+sumOfDigits(n);

    }
}
