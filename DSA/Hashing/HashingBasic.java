package DSA.Hashing;

import java.util.HashMap;

public class HashingBasic {
    public static void main(String[] args) {
//        In Hashmaps there are no duplicate values only uniquer values.
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);

//        This will give the size of the map -
        System.out.println(map.size());
//        This will give the value of the A key.
        System.out.println(map.get('A'));
//        This will give the value of the whole map.
        System.out.println(map);
    }
}
