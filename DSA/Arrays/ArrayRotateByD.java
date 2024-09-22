package DSA.Arrays;

public class ArrayRotateByD {
    public static void main(String[] args) {
        int n = 2;
        int d = 101;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        if(d>n){
            d = d%n;
        }
/*
        for(int i=0;i<d;i++){
            rotate(arr, n);
        }
*/
        rotateBetter(arr, d);
//        rotateBest(arr, d);
        for(int i :arr){
            System.out.println(i);
        }
    }
    // This is O(n*d) time comp and O(1) space comp -
    public static void rotate(int arr[], int n){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    // This is O(n) time comp and O(d) space comp -
    public static void rotateBetter(int arr[], int d) {
        int temp[] = new int[d];
//        First We will put all the Element in till d into the temp arr
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
//        Now we will shift all the rem elements to front.
        for (int i = d; i < arr.length; i++) {
            arr[i-d] = arr[i];
        }
//        Now we will put the Temp arr elements in the back of the Main Array
        for(int i=0;i<temp.length;i++){
            arr[arr.length-d+i] = temp[i];
        }
    }

//    Most Optimized Sol -
// In this we will first reverse the element until d and then the elements from d to n-1 and then reverse the whole array
    public static void rotateBest(int arr[], int d) {
        reverse(arr,0, d-1);
        reverse(arr, d, arr.length - 1);
        reverse(arr,0, arr.length - 1);
    }
    public static void reverse(int arr[],int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
