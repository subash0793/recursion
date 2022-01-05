package mathematicalQuestions;
/*
In this assignment we will work on counting the total number of set bits in any given number. Set bits refer to the value 1 in binary number present in total binary number
example:
 9 in binary is 1001
 set bits=2 as there are two one available in 1001.

 */
public class totalNumberOfSetBits {
    public static void main(String[] args) {
        int n=125;
        System.out.println(Integer.toBinaryString(n));
        int count=0; // we need this counter as the total number of iterations will give us the set bit values
        while (n>0){ // will run the loop until n<=0
            //n=n-(n & (-n));  // here  n & -n gives the right most set bit and we are subtracting it from the total n to shift it
              n=n &(n-1);              // to calculate the remaining bits this overall is also written as n=n & (n-1)
            count++;
        }
        System.out.println(count);
    }
}
