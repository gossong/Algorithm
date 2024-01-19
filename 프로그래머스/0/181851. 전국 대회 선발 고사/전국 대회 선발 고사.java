import java.util.ArrayList;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= rank.length; i++){
            for(int j = 0; j < rank.length; j++){
                if(i==rank[j]&&attendance[j]==true){
                    list.add(j);
                }
            }
        }
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        return 10000*a+100*b+c;
    }
}