package mathematicalQuestions;

/*
rightMost set bit is first high bit in binary from the right. In order to solve this problem we need to find the negative of the number
if we find the negative of a number and add it to the number it gives us the right most bit

 */
public class rightMostSetBit {
    public static void main(String[] args) {
        System.out.println(rightMostHighBit(10));
    }
    static int rightMostHighBit(int num){
        int index=0;
        index=num & (-num);   // how does this work??? this works when you turn the number into its two's complement
        return index;
    }
}
