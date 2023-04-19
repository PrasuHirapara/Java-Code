package DSA.Hashing;
import java.util.HashMap;
import java.util.Map;
// Used to store paired data structure.
// Key is always unique but value can be different.
// Unordered Structure.


public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India",120);
        map.put("USA",23);
        map.put("Russia",100);
        map.put("India",130); // It will update the value.

        System.out.println(map);

        // Search
        System.out.println(map.containsKey("India"));

        // Iterator
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e);
        }
        
    }
}
