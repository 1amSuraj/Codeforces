import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        int limit= 0;
        int c =0;
        for(int i =0;i<n;i++){
            int a=sc.nextInt();
            if(a>b) continue;
            limit += a;
            if(limit>d) {
                limit=0;
                c++;
            }
        }
        System.out.println(c);
    }
}
