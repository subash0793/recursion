package recursionQuestions;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(10));
    }
    static int fact(int number){
        if (number==0 || number==1){
            return 1;
        }
        return number* fact(number-1);
    }
}
