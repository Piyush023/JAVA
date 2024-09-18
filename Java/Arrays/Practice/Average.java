package Java.Arrays.Practice;

import java.util.Scanner;

public class Average {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i< arr.length;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(arr.length);
            avg(arr);
        }
        public static void avg(int arr[]){
            int sum = 0;
            for (int j : arr) {
                sum += j;
            }
            System.out.println("Avg is - "+sum/arr.length);
        }
    }
