package com.dongah.programers.level1;

/*
lottos	win_nums	result
[44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	  [3, 5]
[0, 0, 0, 0, 0, 0]	    [38, 19, 20, 40, 15, 25]  [1, 6]
[45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	  [1, 1]
 */

import java.util.Arrays;

public class LottoRanking {
    public static void main(String[] args) {
        int[] lottos = new int[]{};
        int[] win_nums = new int[]{};

        LottoRanking lottoRanking = new LottoRanking();

        lottos   = new int[]{44, 1, 0, 0, 31, 25};
        win_nums = new int[]{31, 10, 45, 1, 6, 19};

        /*lottos   = new int[]{0, 0, 0, 0, 0, 0};
        win_nums = new int[]{38, 19, 20, 40, 15, 25};*/

        int[] answer = lottoRanking.solution(lottos, win_nums);
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int okCount = 0;
        for (int lotto : lottos) {
            if( Arrays.stream(win_nums).anyMatch(n->n == lotto) ){
                okCount++;
            }
        };

        answer[0] = 6 - (okCount + (int)Arrays.stream(lottos).filter(n->n == 0).count()) + 1;
        answer[0] = answer[0] > 6 ? 6 : answer[0];

        answer[1] = 6 - okCount + 1;
        answer[1] = answer[1] > 6 ? 6 : answer[1];

        return answer;
    }
}
