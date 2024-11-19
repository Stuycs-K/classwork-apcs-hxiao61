import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;



public class Driver{
  public static String[]parse(String file){
    try{
      Scanner inf = new Scanner(new File "input.txt");
      Scanner line = inf.nextLine();
      System.out.println(line);
      return null;
    } catch(Exception e){
      System.exit(1);
    }
    return null;
  }

  public static void main(String[] arg){
    String[]data = new Scanner ("input.txt")
    System.out.println(day1(data));
  }
  public static int day1(String[]data){
    int count = 0;
    int forward = 0;
    int backward = 0;
    int right = 0;
    int left = 0;
    int direction = 1;
    for (int i =0; i < data.length; i++){
      int current = Integer.parseInt(data[i].substring(1));
      if(data[i].contains("R")){
        direction++;
        if(direction == 5){
          direction = 1;
        }
        if(direction == 1){
          forward = forward+current;
        }
        if(direction == 2){
          right = right+current;
        }
        if(direction == 3){
          backward = backward+current;
        }
        if(direction == 4){
          left = left+current;
        }
      }
      if(data[i].contains("L")){
        direction--;
        if(direction == 0){
          direction = 4;
        }
        if(direction == 1){
          forward = forward+current;
        }
        if(direction == 2){
          right = right+current;
        }
        if(direction == 3){
          backward = backward+current;
        }
        if(direction == 4){
          left = left+current;
        }
      }
      }
        return(Math.abs(right-left) + Math.abs(forward-backward));
    }
  }
