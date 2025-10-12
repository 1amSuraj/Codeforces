import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s= s.replaceAll("[{}\\s]","");
        String[] arr = s.split(",");
        HashSet<String> set = new HashSet<>();
        if(s.equals("")){
            System.out.println(0);
            return;
        } 
        for(String ch : arr){
            set.add(ch);
        }
        System.out.println(set.size());
    }
}