package recursionQuestions;

public class numberOfZeros {
    public static void main(String[] args) {
        System.out.println(zeros(120012));
    }
    static int count =0;
    static int zeros(int number){

        if (number==0){
            return 1;
        }
        else{
            if(number%10==0){
                count++;
            }
            zeros(number/10);
            return count;
        }
    }
}

