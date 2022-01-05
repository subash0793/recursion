package mathematicalQuestions;
/*
find the nth magic number
1=  0 0 1 = 5
here every digit is multiplied by 5 raise to the power of n
2= 0 1 0 =25
3= 0 1 1 = 0*5^3 + 1*5^3 +1 *5^1 =30



 */
public class magicNumber {
    public static void main(String[] args) {
        int n=3;
        System.out.println(magicNumber(n));
    }
    static  int magicNumber(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last= n & 1;  // this checks the last digit of a number in binary
            ans=ans+ (last*base); // this stores the answer value for multiplied number with the base
            base=base*5; // increasing the power of base with the increase placement of digit in binary
            n =n>>1; // increasing the placement of the digit also known as right shift.

        }

        return ans;

    }
}
