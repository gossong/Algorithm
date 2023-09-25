import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int nowYear = Integer.parseInt(today.substring(0,4));
        int nowMonth = Integer.parseInt(today.substring(5,7));
        int nowDay = Integer.parseInt(today.substring(8,10));
        
        for(int i=0; i<privacies.length; i++){
            int pYear = Integer.parseInt(privacies[i].substring(0,4));
            int pMonth = Integer.parseInt(privacies[i].substring(5,7));
            int pDay = Integer.parseInt(privacies[i].substring(8,10));
            
            for(int j=0; j<terms.length; j++){
                if(privacies[i].substring(privacies[i].length()-1).equals(terms[j].substring(0,1))){
                    pMonth += Integer.parseInt(terms[j].substring(2));
                    
                    while(pMonth>12){
                        pMonth -= 12;
                        pYear += 1;
                    }
                    
                    if(pDay==1){
                        pDay = 28;
                        pMonth -= 1;
                    }else{
                        pDay -= 1;
                    }
                    
                    if(pYear<nowYear){
                        answer.add(i+1);
                    }else if(pYear==nowYear && pMonth < nowMonth){
                        answer.add(i+1);
                    }else if(pYear==nowYear && pMonth == nowMonth && pDay < nowDay){
                        answer.add(i+1);
                    }
                }
            }
        }
        
        return answer;
    }
}