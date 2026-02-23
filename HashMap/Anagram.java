import java.util.*;

class Anagram{
    public static void main(String args[]){
        String s = "listen";
        String t = "silent";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (map.get(ch) == null || map.get(ch) == 0)
                return false;

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }
}