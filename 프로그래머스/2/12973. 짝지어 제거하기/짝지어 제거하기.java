class Solution{
    public int solution(String s){

        StringBuilder sb = new StringBuilder(s.substring(0,1));
        
        for(int i = 1; i < s.length(); i++){
            if(sb.length()>0&&sb.substring(sb.length()-1).equals(s.substring(i,i+1))){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(s.substring(i,i+1));
            }
        }
        
        if(sb.length()==0){
            return 1;
        }else{
            return 0;
        }
    }
}