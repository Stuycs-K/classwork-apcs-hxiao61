import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    return ((a + b) > c && (a + c) > b && (c + b) > a);
  }
  public static int countTrianglesA(String filename){
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while(input.hasNextInt()){
        int result = 0;
        if(isTriangle(input.nextInt(), input.nextInt(), input.nextInt())){
          result++;
        }
      }
      return result;
  }
  catch (FileNotFoundException ex) {
    //File not found what should you do?
    System.out.println("File not found");
    return; //you can return from a void function just don't put a value.
  }
}
}
