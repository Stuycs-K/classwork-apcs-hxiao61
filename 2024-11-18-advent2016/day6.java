import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class day6{
    public static void main(String[] args){
        String[] data = parse("day6.txt");
        System.out.println(day6(data));
        }
    public static String[] parse(String file) {
        try {
            Scanner inf = new Scanner(new File(file));
            ArrayList<String> lines = new ArrayList<>();
            while (inf.hasNextLine()) {
                String line = inf.nextLine();
                lines.add(line.trim());
            }
            inf.close();
            return lines.toArray(new String[0]);
        } catch (Exception e) {
            System.exit(1);
        }
        return null;
    }
    public static String day6(String[] data){
        String result = "";
        for(int i = 0; i < data[0].length(); i++){
            int a = 0, b = 0, c =0, d = 0, e = 0, f = 0, g = 0, h = 0, ic = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;
            for(int row = 0; row < data.length; row++){
                char ch = data[row].charAt(i);
                if (ch == 'a') a++;
                else if (ch == 'b') b++;
                else if (ch == 'c') c++;
                else if (ch == 'd') d++;
                else if (ch == 'e') e++;
                else if (ch == 'f') f++;
                else if (ch == 'g') g++;
                else if (ch == 'h') h++;
                else if (ch == 'i') ic++;
                else if (ch == 'j') j++;
                else if (ch == 'k') k++;
                else if (ch == 'l') l++;
                else if (ch == 'm') m++;
                else if (ch == 'n') n++;
                else if (ch == 'o') o++;
                else if (ch == 'p') p++;
                else if (ch == 'q') q++;
                else if (ch == 'r') r++;
                else if (ch == 's') s++;
                else if (ch == 't') t++;
                else if (ch == 'u') u++;
                else if (ch == 'v') v++;
                else if (ch == 'w') w++;
                else if (ch == 'x') x++;
                else if (ch == 'y') y++;
                else if (ch == 'z') z++;
            }
            int max = 0;
            char fre = ' ';
            if (a > max) { max = a; fre = 'a'; }
            if (b > max) { max = b; fre = 'b'; }
            if (c > max) { max = c; fre = 'c'; }
            if (d > max) { max = d; fre = 'd'; }
            if (e > max) { max = e; fre = 'e'; }
            if (f > max) { max = f; fre = 'f'; }
            if (g > max) { max = g; fre = 'g'; }
            if (h > max) { max = h; fre = 'h'; }
            if (ic > max) { max = ic; fre = 'i'; }
            if (j > max) { max = j; fre = 'j'; }
            if (k > max) { max = k; fre = 'k'; }
            if (l > max) { max = l; fre = 'l'; }
            if (m > max) { max = m; fre = 'm'; }
            if (n > max) { max = n; fre = 'n'; }
            if (o > max) { max = o; fre = 'o'; }
            if (p > max) { max = p; fre = 'p'; }
            if (q > max) { max = q; fre = 'q'; }
            if (r > max) { max = r; fre = 'r'; }
            if (s > max) { max = s; fre = 's'; }
            if (t > max) { max = t; fre = 't'; }
            if (u > max) { max = u; fre = 'u'; }
            if (v > max) { max = v; fre = 'v'; }
            if (w > max) { max = w; fre = 'w'; }
            if (x > max) { max = x; fre = 'x'; }
            if (y > max) { max = y; fre = 'y'; }
            if (z > max) { max = z; fre = 'z'; }
            result += fre;
    }
    return result;
    }
}