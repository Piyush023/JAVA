package DSA.Hashing;

import java.util.*;

public class SubArrayWith0Sum {
    public static void main(String[] args) {
// Prefix Sum -
        int sum = 0;
        int arr[] = {-3,4,-12,-3,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            sum += arr[i];
            if (map.containsKey(sum)) {
                System.out.println("SubArray with a sum equal to 0");
                return;
            } else if (sum==0) {
                System.out.println("SubArray with a sum equal to 0");
                return;
            } else {
                map.put(sum,sum);
            }
        }
        System.out.println("No SubArray with a sum equal to 0");
    }
}
