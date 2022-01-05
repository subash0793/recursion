package recursionQuestions;

public class ascendingNumberSequence {
    public static void main(String[] args) {
    ascendingSequence(5);
    }
    static void ascendingSequence(int n){
        if (n==1){
            System.out.println(1);
        }
        else{
            ascendingSequence(n-1);
            System.out.println(n);
        }
    }
}
