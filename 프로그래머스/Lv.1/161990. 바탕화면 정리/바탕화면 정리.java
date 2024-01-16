class Solution {
    public int[] solution(String[] wallpaper) {
        int a = wallpaper.length;  // x 최소
        int b = 0;  // x 최대
        int c = wallpaper[0].length(); // y 최소
        int d = 0;  // y 최대
        
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[0].length(); j++){
                if(wallpaper[i].substring(j,j+1).equals("#")){
                    a = a > i ? i : a;
                    b = b > i ? b : i+1;
                    c = c > j ? j : c;
                    d = d > j ? d : j+1;
                }
            }
        }
        int[] answer = {a, c, b, d};
        return answer;
    }
}