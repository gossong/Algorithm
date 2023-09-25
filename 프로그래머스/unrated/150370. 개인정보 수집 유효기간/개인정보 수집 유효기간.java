import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 오늘 날짜
        int nowYear = Integer.parseInt(today.substring(0,4));
        int nowMonth = Integer.parseInt(today.substring(5,7));
        int nowDay = Integer.parseInt(today.substring(8,10));

        // 개인정보
        for(int i=0; i<privacies.length; i++){
            int pYear = Integer.parseInt(privacies[i].substring(0,4));
            int pMonth = Integer.parseInt(privacies[i].substring(5,7));
            int pDay = Integer.parseInt(privacies[i].substring(8,10));

            // 약관
            for(int j=0; j<terms.length; j++){
                // 약관 종류와 비교
                if(privacies[i].substring(privacies[i].length()-1).equals(terms[j].substring(0,1))){
                    pMonth += Integer.parseInt(terms[j].substring(2));
                    // 월 계산
                    while(pMonth>12){
                        pMonth -= 12;
                        pYear += 1;
                    }
                    // 일 계산
                    if(pDay==1){
                        pDay = 28;
                        pMonth -= 1;
                    }else{
                        pDay -= 1;
                    }
                    // 비교
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
