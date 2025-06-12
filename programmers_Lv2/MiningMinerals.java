package programmers_Lv2;

import java.util.Arrays;
import java.util.Comparator;

public class MiningMinerals {
//	https://school.programmers.co.kr/learn/courses/30/lessons/172927
	public static void main(String[] args) {
		int[] picks = {1, 3, 2};
		String[] minerals = {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
		int answer = 0;
		int dia = picks[0];
        int iron = picks[1];
        int stone = picks[2];
        int totalPick = dia + iron + stone;
        int n = minerals.length;
        int[][] mineralGroup = new int[totalPick][6];
        
        for(int i=0; i<Math.min(totalPick * 5, n); i+=5) {
            int sum = 0;
            int damage = 0;

            for(int j=i; j<Math.min(i + 5, n); j++) {
                switch(minerals[j]) {
                    case "diamond":
                        damage = 25;
                        break;
                    case "iron":
                        damage = 5;
                        break;
                    case "stone":
                        damage = 1;
                        break;
                }

                sum += damage;
                mineralGroup[i / 5][j % 5 + 1] = damage;
            }

            mineralGroup[i / 5][0] = sum;
        }

        Arrays.sort(mineralGroup, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        for(int i=0; i<totalPick; i++) {
            int[] temp = mineralGroup[i];
            String pick = "";

            if (dia > 0) {
                dia -= 1;
                pick = "diamond";
            } else if (iron > 0) {
                iron -= 1;
                pick = "iron";
            } else if (stone > 0) {
                stone -= 1;
                pick = "stone";
            }

            for(int j=1; j<6; j++) {
                switch(pick) {
                    case "diamond":
                        answer += (int) Math.ceil(temp[j] / 25.0);
                        break;
                    case "iron":
                        answer += (int) Math.ceil(temp[j] / 5.0);
                        break;
                    case "stone":
                        answer += temp[j];
                        break;
                }
            }
        }
        
        System.out.println(answer);
	}

}
