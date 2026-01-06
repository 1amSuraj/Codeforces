import java.util.*;

public class A_Lineland_Mail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            if (i == 0) {
                min = Math.abs(arr[i] - arr[i + 1]);
                max = Math.abs(arr[n - 1] - arr[i]);
            } else if (i == n - 1) {
                min = Math.abs(arr[i] - arr[i - 1]);
                max = Math.abs(arr[i] - arr[0]);
            } else {
                min = Math.min(Math.abs(arr[i] - arr[i + 1]), Math.abs(arr[i] - arr[i - 1]));
                max = Math.max(Math.abs(arr[n - 1] - arr[i]), Math.abs(arr[i] - arr[0]));
            }
            System.out.println(min + " " + max);
        }

    }

}
