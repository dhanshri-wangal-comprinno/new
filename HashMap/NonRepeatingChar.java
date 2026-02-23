import java.util.*;

class NonRepeatingChar {

    public static char firstUnique(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '_';
    }

    public static void main(String[] args) {
        String str = "aabbcde";
        char result = firstUnique(str);
        System.out.println("First Unique Character: " + result);
    }
}
