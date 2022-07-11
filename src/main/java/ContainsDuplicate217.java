import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate217 {

    //Time O(n^2) | Space O(1)
    public boolean containsDuplicate(int[] nums) {
        int temp;

        for(int i = 0; i < nums.length; i++) {
            temp = nums[i];
            for(int j = i+1; j < nums.length; j ++) {
                if(temp == nums[j]) return true;
            }
        }
        return false;
    }

    //Time O(nlogn) | Space O(1)
    public boolean containsDuplicate1(int[] nums) {

        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]) return true;
        }
        return false;
    }

    //Time O(n) | Space O(n)
    public boolean containsDuplicate2(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }

    //Time O(n) | Space O(n)
    public boolean containsDuplicate3(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) return true;
            map.put(num, 1);
        }
        return false;
    }
}
