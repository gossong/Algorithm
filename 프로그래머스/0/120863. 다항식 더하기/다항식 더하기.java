import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int num = 0;
        String[] sentence = polynomial.split(" ");
        for(int i = 0; i < sentence.length; i+=2){
            if(sentence[i].indexOf("x")>-1){
                if(sentence[i].equals("x")){
                    x++;
                }else{
                    x += Integer.parseInt(sentence[i].substring(0,sentence[i].length()-1));
                }
            }else{
                num += Integer.parseInt(sentence[i]);
            }
        }
        if(x==0){
            answer = num + "";
        }else if(x==1){
            if(num==0){
                answer = "x";
            }else{
                answer = "x + " + num;
            }
        }else{
            if(num==0){
                answer = x + "x";
            }else{
                answer = x + "x + " + num;
            }
        }
        return answer;
    }
}