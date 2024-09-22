package DSA.Arrays;

public class ArrayRotateBy1 {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n];
        for(int i=0;i<5;i++){
            arr[i] = i+1;
        }
        // Rotate By One -
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int i :arr){
            System.out.println(i);
        }
    }
}
