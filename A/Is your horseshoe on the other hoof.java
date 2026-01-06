import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int c= 0;
        String[] arr = s.split(" ");
        HashSet<String> set = new HashSet<>();
        for(String ss : arr){
            if(set.contains(ss))c++;
            else set.add(ss);
        }
        System.out.println(c);
    }
}
