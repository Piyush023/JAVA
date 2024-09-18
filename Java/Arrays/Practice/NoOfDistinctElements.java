package Java.Arrays.Practice;

import java.util.Scanner;

public class NoOfDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        boolean isDis = true;
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i] == arr[j]){
                    isDis = false;
                    break;
                }
            }
            if(isDis){
                count++;
            }
            isDis = true;
        }
        System.out.println("No of Distinct Element - "+ count);
    }
}
