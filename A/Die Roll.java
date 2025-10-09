import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();
        int max = Math.max(y,w);
        int left = 7-max;
        int denominator= 6;
        int gcd  = gcd(left,denominator);
        
        System.out.println(left/gcd+"/"+denominator/gcd);
    }
    static int gcd(int a , int b){
        return b==0 ? a : gcd(b,a%b);
    }
}
