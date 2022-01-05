package recursionQuestions;//this is the recursion implementation of the binarysearch algorithm.


public class binarySearchRecursion {
    public static void main(String[] args) {
    int arr[]={2,5,7,9,11,23,31};

        System.out.println(binarySearch(arr,1,0,arr.length-1) );
    }
    static int binarySearch(int arr[], int target, int start, int end){
            //here we pass in the argument of array, target like in regular binary search algorithm, but also the start and end coz these are the
        //values that will determine the size of the array, everytime you call the array the size must be reduced as we are calling the funtion again
        //and again....

        if (start>end){   // this is the base condition, if the start is already greater than the end value the target is not in the array.
            return -1;
        }
        int mid=start+(end-start)/2; // this variable is one dependent in the one function call, this we donot write this in the argument.


        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]>target){
            return binarySearch(arr,target,start,mid-1); // returnin the value if matches if not funtion will call again again until it finds
                                            // the value or goes of the function to call the base condition.
        }
        return binarySearch(arr,target,mid+1,end);
    }

}
