// Steven Wu swu60@stuy.edu
// Haowen Xiao hxiao61@stuy.edu
public class ArrayMethods {
    public static String arrToString(int[] nums){
        String out = "[";
        for (int i = 0; i < nums.length; i++){
            out += nums[i];
            if (i != nums.length - 1){
                out += ", ";
            }
        }
        out += "]";
        return out;
    }
    public static String arrToString(int[][]ary){
        String out = "[";
        for (int i = 0; i < ary.length; i++){
            out += arrToString(ary[i]);
            if (i != ary.length - 1){
                out += ", ";
            }
        }
        out += "]"
        return out;
    }   
    public static int arr2DSum(int[][]nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i].length != 0) {
                for (int ii = 0; ii < nums[i].length; ii++){
                    count += nums[i][ii];
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] test1 = {{1, 2, 3}};
        System.out.println("arryToString({{1, 2, 3}}) expected [[1, 2 ,3]] result: " + arryToString(test1));
        int[][] test2 = {{1}, {2}, {3}};
        System.out.println("arryToString({{1}, {2}, {3}};) expected [[1], [2], [3]] result: " + arryToString(test2));
        int[][] test3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("arryToString({{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}) expected [[1, 2, 3], [4, 5, 6], [7, 8, 9]] result: " + arryToString(test3));
        int[][] test4 = {{}};
        System.out.println("arryToString({{}}) expected [[]] result: " + arryToString(test4));
        int[][] test5 = {{}, {}, {}};
        System.out.println("arryToString({{}, {}, {}}) expected [[], [], []] result: " + arryToString(test5));
        int[][] test6 = {{1, 2, 3}, {}, {4, 5}};
        System.out.println("arryToString({{1, 2, 3}, {}, {4, 5}}) expected [[1, 2, 3], [], [4, 5]] result: " + arryToString(test6));
        int [][] a = {{2,1},{3,4,5},{1}};
        System.out.println("Expected: 16 " + "Output: "arr2DSum(a));
        int [][] a = new int [][]{{},{},{}};
        System.out.println("Expected: 0 " + "Output: "arr2DSum(a));
        int [][] a = new int [][]{{23, 24, 29},{},{1}};
        System.out.println("Expected: 16 " + "Output: "arr2DSum(a));
        int [][] a = new int [][]{{1},{2},{3}};
        System.out.println("Expected: 6 " + "Output: "arr2DSum(a));
        int [][] a = new int [][]{{-23, 1, 2},{9, 11},{}};
        System.out.println("Expected: 0" + "Output: "arr2DSum(a));

    }
}
