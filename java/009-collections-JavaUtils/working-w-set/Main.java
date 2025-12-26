import java.util.Set;
import java.util.HashSet;
// dont' work with duplicates items in the array

// find all pairs in an array that sum to a specific target
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19}; // pairs
        int target = 20; // target sum
        Set<String> result = findPairs(arr, target);
        for (String pair : result) {
            System.out.println("pair: " + pair + " hashcode: " + pair.hashCode());
        }
    }

    public static Set<String> findPairs(int[] arr, int target) {
        Set<String> pairs = new HashSet<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {

                pairs.add(Math.min(num, complement) + "," + Math.max(num, complement));
            }
            seen.add(num);
        }
        return pairs;
    }
}