import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char ch;
        for(int i=0; i<a.length(); i++){
            ch = a.charAt(i);
            if(ch<=90)
                ch+=32;
            else
                ch-=32;
            System.out.print(ch);
        }
    }
}