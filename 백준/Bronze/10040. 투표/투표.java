import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int game = Integer.parseInt(st.nextToken());
        int people = Integer.parseInt(st.nextToken());

        int[] play = new int[game];
        int[] vote = new int[people];
        int[] bestGame = new int[game];


        for (int i = 0; i < game; i++) {
            play[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < people; i++) {
            vote[i] = Integer.parseInt(br.readLine());

            for (int j = 0; j < game; j++) {
                // 심사위원의 기준에 충족되는 게임 중, 가장 빠른 게임을 찾는다.
                if (play[j] <= vote[i]) {
                    bestGame[j]++;
                    break;
                }
            }
        }

        int min = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < game; i++) {
            if (min < bestGame[i]){
                index = i;
                min = bestGame[i];
            }
        }

        // 배열은 0번째부터 시작하니까 +1해서 출력한다.
        sb.append(index + 1);
        System.out.println(sb.toString());
    }
}