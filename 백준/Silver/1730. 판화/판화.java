import java.util.*;
import java.lang.*;
import java.io.*;

/**
1. 입력받고 N * N의 배열 만들기
2. .이라면 명령어대로 변경
    U - [i, i], [i-1, i] 자리를 |으로
    D - [i, i], [i+1, i] 자리를 |으로
    R - [i, i], [i], [i+1] 자리를 -로
    L - [i, i], [i], [i-1] 자리를 -로
4. R이나 L이 명령어인데 지금 자리가 |라면 +로
5. D나 U가 명령어인데 지금 자리가 -라면 +로
6. +나 |, -라면 그냥 그대로
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] pan = new char[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(pan[i], '.');
        }

        String str = br.readLine();

        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char cmd = str.charAt(i);

            if (cmd == 'U') {
                if (x == 0) continue;
                if (pan[x][y] == '.') {
                    pan[x][y] = '|';
                } else if (pan[x][y] == '-') {
                    pan[x][y] = '+';
                }

                if (pan[x-1][y] == '.') {
                    pan[x-1][y] = '|';
                } else if (pan[x-1][y] == '-') {
                    pan[x-1][y] = '+';
                }

                x -= 1;
            } else if (cmd == 'D') {
                if (x == N - 1) continue;
                if (pan[x][y] == '.') {
                    pan[x][y] = '|';
                } else if (pan[x][y] == '-') {
                    pan[x][y] = '+';
                }

                if (pan[x+1][y] == '.') {
                    pan[x+1][y] = '|';
                } else if (pan[x+1][y] == '-') {
                    pan[x+1][y] = '+';
                }
                x += 1;
            } else if (cmd == 'R') {
                if (y == N - 1) continue;
                if (pan[x][y] == '.') {
                    pan[x][y] = '-';
                } else if (pan[x][y] == '|') {
                    pan[x][y] = '+';
                }

                if (pan[x][y+1] == '.') {
                    pan[x][y+1] = '-';
                } else if (pan[x][y+1] == '|') {
                    pan[x][y+1] = '+';
                }
                y += 1;
            } else if (cmd == 'L') {
                if (y == 0) continue;
                if (pan[x][y] == '.') {
                    pan[x][y] = '-';
                } else if (pan[x][y] == '|') {
                    pan[x][y] = '+';
                }

                if (pan[x][y-1] == '.') {
                    pan[x][y-1] = '-';
                } else if (pan[x][y-1] == '|') {
                    pan[x][y-1] = '+';
                }
                y -= 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(pan[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}