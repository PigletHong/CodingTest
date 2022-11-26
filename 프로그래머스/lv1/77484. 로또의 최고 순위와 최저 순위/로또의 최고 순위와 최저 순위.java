class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = new int[2];
        int win = 0; // 맞춘 번호
        int zero = 0; // 알아볼 수 없는 번호

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
                continue;
            }

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    win++;
                    break;
                }
            }
        }

        answer[0] = rank(win + zero);
        answer[1] = rank(win);
        
        return answer;
    }

    
    public static int rank(int n) {
        switch (n) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}