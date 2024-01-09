import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String answer = "";
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArray = a.toCharArray();
        
        for(int i = 0; i < a.length(); i++){
            if(Character.isUpperCase(charArray[i])){
                answer = answer + a.substring(i,i+1).toLowerCase();
            }else{
                answer = answer + a.substring(i,i+1).toUpperCase();
            }
        }
        
        System.out.println(answer);
    }
}