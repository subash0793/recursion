package mathematicalQuestions;

public class totalNumberOfZerosAndOne {
    public static void main(String[] args) {
        int num=13;
        int count=0;
        int base=2;
        int digits = (int)((Math.log(num)/Math.log(base))+1);
        System.out.println("Binary value:  "+Integer.toBinaryString(num));
        System.out.println("Total number of digits : "+digits);

        while(num>0){
            num=num & (num-1);
            count++;
        }

        System.out.println("number of ones "+count);
        System.out.println("number of zeros "+(digits-count));
    }
}
