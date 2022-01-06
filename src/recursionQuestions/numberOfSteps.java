package recursionQuestions;

public class numberOfSteps {
    public static void main(String[] args) {
        System.out.println(steps(14,0));
    }
    static int steps(int num,int count){
        if (num==0){
            return count;
        }
        else{
            if(num%2==0){
               return steps(num/2,count+1);
            }
            if(num%2==1){
                return steps(num-1,count+1);
            }
        }
        return count;
    }
}
