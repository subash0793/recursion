package recursionQuestions;



public class descendingNumberSequence {
    public static void main(String[] args) {

        seq(5);
    }
    static void seq(int n){
        if (n==1){
            System.out.println(1);
        }else{
            System.out.println(n); // here we are printing before we finish the execution
           seq(n-1); // and we are changning the argument in function


        }

    }
}
