import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class isAnagram242 {

    // Time O(n+n) | Space O(n+n)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> maps = new HashMap<>();
        Map<Character, Integer> mapt = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            maps.merge(s.charAt(i), 1, Integer::sum);
            mapt.merge(t.charAt(i), 1, Integer::sum);
        }
        return maps.equals(mapt);
    }

    // Time O(n+n) | Space O(n+n)
    public boolean isAnagram1(String s, String t) {
        if(s.length() != t.length()) return false;

        return s.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.counting())).equals(
                t.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.counting())));

    }

    // Time O(n) | Space O(26)
    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int i: counts){
            if(i != 0) return false;
        }
        return true;
    }
}
