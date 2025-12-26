import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    private int[] arr;

    public TwoSum(int[] arr) {
        this.arr = arr;
    }
    public boolean hasPairWithSum(int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
