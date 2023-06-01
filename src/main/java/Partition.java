import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Partition {


    public static void main(String[] args) {
        LongestString("dvdf");

    }

    public static int LongestString(String s){

        int n = s.length();
        int ans = 0;
        int left = 0, right = 0;
        HashSet<Character> set = new HashSet<>();
        while (left < n && right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                ans = Math.max(ans, right - left);
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return ans;


    }
}
