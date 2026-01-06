import java.util.*;

public class A_Team_Olympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
                one.add(i + 1);
            else if (arr[i] == 2)
                two.add(i + 1);
            else
                three.add(i + 1);
        }
        int total = Math.min(one.size(), Math.min(two.size(), three.size()));
        System.out.println(total);
        for (int i = 0; i < total; i++) {
            System.out.println(one.get(i) + " " + two.get(i) + " " + three.get(i));
        }
    }
}