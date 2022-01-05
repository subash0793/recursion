package mathematicalQuestions;

public class numberOfDigits {
    public static void main(String[] args) {
        int n=2;
        int base=10;

        int digits=(int)(Math.log(n)/Math.log(base)+1);
        System.out.println(digits);
    }
}
