import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Chess {
    // 컬러 체인지 메서드
    public static String colorChange(String color) {
        String white = "W";
        String black = "B";

        if (color.equals(white))
            color = black;
        else
            color = white;

        return color;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] board = new String[n][m];
        int count;
        ArrayList<Integer> counts = new ArrayList<>();
        String color;
        String white = "W";
        String black = "B";

        // 보드 입력
        for (int i = 0 ; i < n ; i++) {
            board[i] = br.readLine().split("");
        }

        // 본래의 보드 저장
        String[][] originalBoard = new String[n][m];
        for(int i = 0; i < board.length; i++){
            System.arraycopy(board[i], 0, originalBoard[i], 0, board[0].length);
        }

        // 최솟값 구하기
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (i + 7 < n && j + 7 < m) {
                    // 보드의 첫 번째 칸이 흰색인 경우
                    for(int k = 0; k < originalBoard.length; k++){ // 본래의 보드 정보를 보드에 저장
                        System.arraycopy(originalBoard[k], 0, board[k], 0, originalBoard[0].length);
                    }

                    if (board[i][j].equals(white))
                        count = 0;
                    else
                        count = 1;

                    board[i][j] = white;
                    color = white;

                    for (int cI = i ; cI <= i + 7; cI++) {
                        if (cI > i) {
                            // 다음 줄의 첫번째 칸 색깔이 같을 때
                            if (board[cI - 1][j].equals(board[cI][j])) {
                                color = board[cI][j];
                                count++;
                                board[cI][j] = colorChange(color);
                                color = board[cI][j];
                            } else color = board[cI][j];
                        }

                        for (int cJ = j + 1 ; cJ < j + 8 ; cJ++) {
                            if (board[cI][cJ].equals(color)) {
                                count++;
                                board[cI][cJ] = colorChange(color);
                                color = board[cI][cJ];
                            } else color = board[cI][cJ];
                        }
                    }

                    counts.add(count);

                    // 보드의 첫 번째 칸이 검은색인 경우
                    for(int k = 0; k < originalBoard.length; k++){ // 본래의 보드 정보를 보드에 저장
                        System.arraycopy(originalBoard[k], 0, board[k], 0, originalBoard[0].length);
                    }

                    if (board[i][j].equals(black))
                        count = 0;
                    else
                        count = 1;

                    board[i][j] = black;
                    color = black;

                    for (int cI = i ; cI <= i + 7; cI++) {
                        if (cI > i) {
                            // 다음 줄의 첫번째 칸 색깔이 같을 때
                            if (board[cI - 1][j].equals(board[cI][j])) {
                                color = board[cI][j];
                                count++;
                                board[cI][j] = colorChange(color);
                                color = board[cI][j];
                            } else color = board[cI][j];
                        }

                        for (int cJ = j + 1 ; cJ < j + 8 ; cJ++) {
                            if (board[cI][cJ].equals(color)) {
                                count++;
                                board[cI][cJ] = colorChange(color);
                                color = board[cI][cJ];
                            } else color = board[cI][cJ];
                        }
                    }

                    counts.add(count);
                }
            }
        }

        System.out.println(Collections.min(counts));

    }


}
