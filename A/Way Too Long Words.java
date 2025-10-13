import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arr[] = new String[n];
        for(int i =0;i<n;i++){
            arr[i] = br.readLine();
        }
        for(String word : arr){
            int insert = word.length()-2;
            if(word.length()>10)
            System.out.println(""+word.charAt(0)+insert+word.charAt(word.length()-1));
            else
            System.out.println(word);
        }
        
    }
}
