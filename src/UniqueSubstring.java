import java.util.HashSet;
import java.util.Set;

/** 对于输入的字符串序列，输出最大的无重复字串长度。 */
public class UniqueSubstring {

    public static void main(String[] args) {
        String in1 = "abcabcbb";
        System.out.println(3 == func(in1));

        String in2 = "bbbbb";
        System.out.println(1 == func(in2));

        String in3 = "pwwkew";
        System.out.println(3 == func(in3));
    }

    public static int func(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
