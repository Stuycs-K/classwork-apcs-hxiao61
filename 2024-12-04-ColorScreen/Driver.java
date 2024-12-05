import java.util.Random;

public class Driver{
    public static int row = 31;
    public static int col = 80;
    public static void drawborder(){
        Text.color(Text.BLUE);
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
    public static void main(String[] args) {
        System.out.println(Text.CLEAR_SCREEN);
        System.out.println(Text.HIDE_CURSOR);
        drawborder();
        random()
    }
}