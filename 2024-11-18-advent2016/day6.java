public class day6{
    public static void main(String[] args){

    }
    public static String day6(String[] data){
        String result = "";
        for(int i = 0; i < data[0].length(); i++){
            int a = 0, b = 0, c =0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;
            for(int row = 0; row < messages.length; row++){
                char c = messages[row].charAt(i);
                if (c == 'a') a++;
                else if (c == 'b') b++;
                else if (c == 'c') c++;
                else if (c == 'd') d++;
                else if (c == 'e') e++;
                else if (c == 'f') f++;
                else if (c == 'g') g++;
                else if (c == 'h') h++;
                else if (c == 'i') i++;
                else if (c == 'j') j++;
                else if (c == 'k') k++;
                else if (c == 'l') l++;
                else if (c == 'm') m++;
                else if (c == 'n') n++;
                else if (c == 'o') o++;
                else if (c == 'p') p++;
                else if (c == 'q') q++;
                else if (c == 'r') r++;
                else if (c == 's') s++;
                else if (c == 't') t++;
                else if (c == 'u') u++;
                else if (c == 'v') v++;
                else if (c == 'w') w++;
                else if (c == 'x') x++;
                else if (c == 'y') y++;
                else if (c == 'z') z++;
            }
            int max = 0;
            char fre = '';
            if (a > max) { max = a; fre = 'a'; }
            if (b > max) { max = b; fre = 'b'; }
            if (c > max) { max = c; fre = 'c'; }
            if (d > max) { max = d; fre = 'd'; }
            if (e > max) { max = e; fre = 'e'; }
            if (f > max) { max = f; fre = 'f'; }
            if (g > max) { max = g; fre = 'g'; }
            if (h > max) { max = h; fre = 'h'; }
            if (i > max) { max = i; fre = 'i'; }
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