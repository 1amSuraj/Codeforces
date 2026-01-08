import java.util.*;

public class A_New_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char ch = (char) ('a' + (i % k));
            System.out.print(ch);
        }
        sc.close();
    }
}
