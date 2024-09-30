public class MyArrays {
    public static void main(String[] args) {

    }
    public static String aryToString(int[] nums) {
        String out = "[";
        for (int i = 0; i < nums.length; i++) {
            out += nums[i];
            if (i != nums.length - 1) {
                out += ", ";
            }
        }
        out += "]";
        return out;
    }
    public static int[] returnCopy(int[] ary) {

    }
    public static int[] concatArray(int[] ary1, int[] ary2) {
        int[] news = new int[ary1.length + ary2.length];
        for (int i = 0; i < ary1.length; i++) {
            news[i] = ary1[i];
        }
        for (int i = 0; i < ary2.length; i++) {
            news[ary1.length + i] = ary2[i];
        }
        return news;
    }
}