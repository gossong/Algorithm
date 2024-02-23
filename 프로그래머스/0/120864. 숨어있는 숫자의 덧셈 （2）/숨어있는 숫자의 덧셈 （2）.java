class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";
        for(int i = 0; i < my_string.length(); i++){
            boolean check = false;
            if(Character.isDigit(my_string.charAt(i))) {
				check = true;
                temp += my_string.substring(i,i+1);
			}else{
                if(!check && !temp.equals("")){
                    answer += Integer.parseInt(temp);
                    temp = "";
                }
                check = false;
            }
        }
        if(!temp.equals("")){
            answer += Integer.parseInt(temp);
            temp = "";
        }
        return answer;
    }
}