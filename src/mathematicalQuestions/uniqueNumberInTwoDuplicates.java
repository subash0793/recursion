package mathematicalQuestions;

public class uniqueNumberInTwoDuplicates {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }
    static int ans(int arr[]){
        int unique=0;
        for (int i=0; i<=arr.length-1; i++){
            unique^=arr[i];
        }
        return unique;
    }
}
