public class MyArrays {
    public static void main(String[] args) {
        System.out.println("returnCopy({1}) expected [1] result: " + aryToString(returnCopy(new int[]{1})));
        System.out.println("returnCopy({1, 2, 3}) expected [1, 2, 3] result: " + aryToString(returnCopy(new int[]{1, 2, 3})));
        System.out.println("returnCopy({}) expected [] result: " + aryToString(returnCopy(new int[]{})));
        System.out.println("concatArray({1, 2}, {3, 4}) expected [1, 2, 3, 4] result: " + aryToString(concatArray(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println("concatArray({1}, {}) expected [1] result: " + aryToString(concatArray(new int[]{1}, new int[]{})));
        System.out.println("concatArray({}, {1}) expected [1] result: " + aryToString(concatArray(new int[]{}, new int[]{1})));
        System.out.println("concatArray({5}, {6, 7}) expected [5, 6, 7] result: " + aryToString(concatArray(new int[]{5}, new int[]{6, 7})));
        System.out.println("concatArray({6, 7}, {5}) expected [6, 7, 5] result: " + aryToString(concatArray(new int[]{6, 7}, new int[]{5})));
        System.out.println("concatArray({}, {}) expected [] result: " + aryToString(concatArray(new int[]{}, new int[]{})));
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
        int[] dupe = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
            dupe[i] = ary[i];
        }
        return dupe;
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