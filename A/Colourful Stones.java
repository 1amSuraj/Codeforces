import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int j = 0;
        for(int i = 0 ; i<s2.length();i++){
            char ch1 = s1.charAt(j);
            char ch2 = s2.charAt(i);
            if(ch1==ch2){
                j++;
            }
        }
        System.out.println(j+1);
        
    }
}
