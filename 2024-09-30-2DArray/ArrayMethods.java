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
    public static int[][] swapRC(int[][] nums) {
        int[][] out = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int ii = 0; ii < nums[i].length; ii++) {
                out[ii][i] = nums[i][ii];
            }
        }
        return out;
    } 
    // 3. Modify a given 2D array of integer as follows:
    // Replace all the negative values:
    // -When the row number is the same as the column number replace
    // that negative with the value 1
    // -All other negatives replace with 0
    public static void replaceNegative(int[][] vals) {
        for (int i = 0; i < vals.length; i++){
            for (int ii = 0; ii < vals[i].length; ii++) {
                if (vals[i][ii] < 0 && i == ii){
                    vals[i][ii] = 1;
                }
                else if (vals[i][ii] < 0){
                    vals[i][ii] = 0;
                }
            }
        }
    }

    // 4. Make a copy of the given 2d array.
    // When testing : make sure that changing the original does NOT change the copy.
    // DO NOT use any built in methods that "copy" an array.
    // You SHOULD write a helper method for this.
    // If you don't see a good way to do that, you should stop and look at prior
    // methods.
    public static int[][] copy(int[][] nums) {
        int[][] out = new int[][] out[nums.length][nums[0].length];
        return null;
    }

    public static int[] 1dcopy(int[] ary){
        int[] out = new int[ary.length];
        for (int i = 0; i < out.length; i++){
            out[i] = ary[i];
        }
        return out;
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
