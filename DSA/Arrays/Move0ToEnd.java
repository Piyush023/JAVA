package DSA.Arrays;

public class Move0ToEnd {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {0,10,20,0,50,30,14,0};
        // Naive - To Traverse the Array and swap the first 0 element with first non-element after the index of 0 element.
        /* for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        } */
        // Optimized - To Maintain the count of the non-zero element and switch it with the index of the non-zero element.
        int count = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for(int i :arr){
            System.out.println(i);
        }
    }
}
