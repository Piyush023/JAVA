package Arrays.Practice;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sum(arr);
    }
    public static void sum(int arr[]){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum is - "+sum);
    }
}
