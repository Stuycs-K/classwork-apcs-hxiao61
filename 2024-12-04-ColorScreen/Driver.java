import java.util.Random;

public class Driver{
    public static int row = 31;
    public static int col = 80;
    public static void drawborder(){
        Text.color(Text.BLUE, Text.background(Text.MAGENTA), Text.BRIGHT);
        for (int i = 1; i <= col; i++){
            Text.go(1, i);
            System.out.print("O");
            Text.go(row, i);
            System.out.print("O");
        }
        for(int i = 1; i <= row; i++){
            Text.go(i, 1);
            System.out.print("O");
            Text.go(i, col);
            System.out.print("O");
        }
        System.out.print(Text.RESET);
    }
    public static random(){
        return (int)(Math.random() * (99 - 0 + 1)) + 0;
    }
    public static void display(){
        for(int i = 0; i < 3; i++){
            int num = random();
            if(num < 25){
                Text.color(Text.RED, Text.BRIGHT);
            } else if (num > 75) {
                Text.color(Text.GREEN, Text.BRIGHT);
            } else {
                Text.color(Text.WHITE);
            }
            System.out.print(number);
        }
    }
    public static void seperate(){
        Text.color(Text.BLUE, Text.background(Text.MAGENTA), Text.BRIGHT);
        for(int i = 1; i <= col; i++){
            System.out.print(".");
        }
    }
    public static void main(String[] args) {
        System.out.println(Text.CLEAR_SCREEN);
        System.out.println(Text.HIDE_CURSOR);
        drawborder();
        display();
        seperate();
        Text.go(31);
        System.out.println(Text.RESET);
    }
}