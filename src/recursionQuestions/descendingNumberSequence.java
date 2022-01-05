package recursionQuestions;



public class descendingNumberSequence {
    public static void main(String[] args) {

        seq(5);
    }
    static void seq(int n){
        if (n==1){
            System.out.println(1);
        }else{

           seq(n-1);
           System.out.println(n);

        }

    }
}
