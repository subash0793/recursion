package recursionQuestions;

public class reverseDigitsRecursion {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(rev(234));
    }
    static int sum=0;
static int reverse(int num){   // this is creating an extra variable outside the scope
        if (num%10==0){
            return num;
        }
        else{
            sum=sum*10+num%10;
            num=reverse(num/10);
            return sum;
        }
}

// this is creating the recursive method and calling the method in other method.

    static int rev(int num){
        int digits=(int)Math.log10(num)+1;
    return revForcall(num,digits);
    }

    static int revForcall(int num, int digits){
        if(num%10==num){
            return num;
        }

    return (num%10)*(int) Math.pow(10,digits-1)+revForcall(num/10,digits-1);
    }


}
