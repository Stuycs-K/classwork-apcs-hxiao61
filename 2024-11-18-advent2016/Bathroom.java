import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Driver{
    public static void main(String[] arg){

    }
    public static String bathroom(String[]data){
        String[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = 1;
        int col = 1;
        String code = "";
        for(int i = 0; i < data.length; i++){
            if(data[i] == "U"){
                row--;
            }
            if(data[i] == "D"){
                row++;
            }
            if(data[i] == "L"){
                col--;
            }
            if(data[i] == "R"){
                col++;
            }
        }
    }

}