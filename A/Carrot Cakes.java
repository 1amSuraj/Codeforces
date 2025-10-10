import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();
 
        // ceil(n/k) = (n + k - 1) / k
        int batches = (n + k - 1) / k;
 
        // if oven build time < time to finish second last batch
        if (d < t * (batches - 1))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
