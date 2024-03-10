class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] arr = dartResult.split("");
        int[] point = new int[3];
        int index = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(isNum(arr[i])){ // 숫자인지 확인
                index++;
                point[index] = Integer.parseInt(arr[i]);
                if(isNum(arr[i+1])){ // 10인지 확인
                    point[index] = Integer.parseInt(arr[i]) * 10;
                    i++;
                }
                i++;
            }
            // 문자 확인
            switch (arr[i]){
                case "D":
                    point[index] = (int)Math.pow(point[index],2); break;
                case "T":
                    point[index] = (int)Math.pow(point[index],3); break;
                case "*":
                    point[index] = point[index]*2;
                    if(index > 0){
                        point[index-1] = point[index-1]*2;
                    }
                    break;
                case "#":
                    point[index] *= -1;
                    break;
            }
        }
        for(int p : point){
            answer += p;
        }
        return answer;
    }
    
    static boolean isNum(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}