
public class Main {

    public static void main(String[] args) {
        int[] t = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] s = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            if (i % 4 == 0 && i < t.length) {
                str.append("\n ");
            }
            str.append(t[i]);
            if (i < t.length-1) {
                str.append(", ");
            } else {
                str.append("\n");
            }
        }
        return "{" + str + "}\n";
    }
}
