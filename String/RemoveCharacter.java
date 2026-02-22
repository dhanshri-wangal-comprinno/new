public class RemoveCharacter {
    public static String removeChar(String str, char ch) {
        char[] arr = str.toCharArray();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ch) {
                arr[j++] = arr[i];
            }
        }

        return new String(arr, 0, j);
    }

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'l';
        System.out.println("After removing '" + ch + "': " + removeChar(str, ch));
    }
}