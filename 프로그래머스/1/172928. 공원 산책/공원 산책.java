class Solution {
    public int[] solution(String[] park, String[] routes) {
        int width = park[0].length() - 1;
        int height = park.length - 1;

        // 시작 위치
        int[] start = new int[2];
        for (int i = 0; i < park.length; i++) {
            int index = park[i].indexOf("S");
            if (index != -1) {
                start[0] = i;  // x
                start[1] = index;  // y
                break;
            }
        }

        // 현재 위치 (x, y)
        int x = start[0];
        int y = start[1];

        // 순회
        for (String route : routes) {
            String direction = route.substring(0, 1); // 방향
            int distance = Integer.parseInt(route.substring(2)); // 거리

            boolean check = false;

            // 방향 확인 후
            if (direction.equals("E")) {
                for (int i = 1; i <= distance; i++) {
                    // 공원을 나가거나 장애물이 있을 경우 - true
                    if (y + i > width || park[x].charAt(y + i) == 'X') {
                        check = true;
                        break;
                    }
                }
                if (!check) { // false일 경우에만 distance만큼 이동
                    y += distance;
                }
                
            } else if (direction.equals("W")) {
                for (int i = 1; i <= distance; i++) {
                    if (y - i < 0 || park[x].charAt(y - i) == 'X') {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    y -= distance;
                }
                
            } else if (direction.equals("S")) {
                for (int i = 1; i <= distance; i++) {
                    if (x + i > height || park[x + i].charAt(y) == 'X') {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    x += distance;
                }
                
            } else if (direction.equals("N")) {
                for (int i = 1; i <= distance; i++) {
                    if (x - i < 0 || park[x - i].charAt(y) == 'X') {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    x -= distance;
                }
            }
        }

        int[] answer = {x, y};
        return answer;
    }
}
