package mathematicalQuestions;
// check if the number is even or odd using bitwise operation

import org.w3c.dom.ls.LSOutput;

public class oddEven {
    public static void main(String[] args) {
        int n=67;
        System.out.println(isOdd(n));
    }
    static String isOdd(int n){
            if ((n&1)==1){   //anything "and" with 1 always gives the same number; ususally we check the least significant digit
                            // the last digit is known as the LSB.
                return "odd";
            }
            return "even";
    }
}
