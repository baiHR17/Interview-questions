import java.util.LinkedHashMap;

/** “aaeefssgyyy”，输出“a2e2f1s2g1y3”。 */
public class test1 {
    public static void main(String[] args) {
        String s1 = "aaeefssgyyy";
        System.out.println(func(s1).equals("a2e2f1s2g1y3"));
    }

    public static String func(String in) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < in.length(); i++) {
            char cur = in.charAt(i);
            if (map.containsKey(cur)) {
                int val = map.get(cur);
                map.put(cur, val + 1);
            } else {
                map.put(cur, 1);
            }
        }
        String result = "";
        for (Character c: map.keySet()) {
            result += c;
            result += map.get(c).toString();
        }

        return result;
    }
}
