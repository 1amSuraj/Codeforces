import java.util.*;

public class A_Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int c = 0;
            int min = 0;
            int maxc = 0;
            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '#') {
                    if (c == 0)
                        continue;
                    if (c < 3 && c >= 1)
                        min += c;
                    else
                        min += 2;
                    c = 0;

                } else
                    c++;
                maxc = Math.max(maxc, c);
            }
            if (c >= 1 && c < 3)
                min += c;
            else if (c > 2)
                min += 2;
            if (maxc >= 3)
                min = 2;
            System.out.println(min);
            t--;
        }
    }
}
