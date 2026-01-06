
import java.util.*;

public class A_Helpful_Maths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split("\\+");
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(a[i]);
            if (i < arr.length - 1) {
                System.out.print("+");
            }
        }

    }
}
