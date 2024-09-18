package Java.Arrays.Practice;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i< arr.length;i++){
                arr[i] = sc.nextInt();
            }
            max(arr);
        }
        public static void max(int arr[]){
            int max = 0;
            for (int j : arr) {
                if(max<=j){
                    max = j;
                }
            }
            System.out.println("Max is - "+ max);
        }
    }

