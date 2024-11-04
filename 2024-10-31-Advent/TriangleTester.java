import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    return ((a + b) > c && (a + c) > b && (c + b) > a);
  }
  public static int countTrianglesA(String filename);
}
