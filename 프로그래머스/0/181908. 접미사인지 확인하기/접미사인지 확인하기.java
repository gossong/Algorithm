class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] my = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            my[i] = my_string.substring(i);
        }
        for(int j = 0; j < my.length; j++){
            if(my[j].equals(is_suffix)){
                answer = 1;
            }
        }
        return answer;
    }
}