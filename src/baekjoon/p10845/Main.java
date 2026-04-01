package baekjoon.p10845;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력 모아서 한 번에
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 명령 개수

        Queue<Integer> q = new LinkedList<>(); // 큐 생성 (FIFO 구조)
        int last = -1; // back 값을 따로 저장 (큐는 뒤 접근이 없음)

        for(int i = 0; i < N; i++){
            // 명령어 파싱
            StringTokenizer st = new StringTokenizer(br.readLine()); // 공백으로 나누기.
            String cmd = st.nextToken();

            if(cmd.equals("push")){
                int x = Integer.parseInt(st.nextToken());
                q.add(x);     // 뒤에 추가 (enqueue)
                last = x;     // 마지막 값 갱신

            }else if(cmd.equals("pop")){
                if(q.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(q.poll()).append("\n"); // 앞에서 제거 (dequeue)
                }

            }else if(cmd.equals("size")){
                sb.append(q.size()).append("\n");

            }else if(cmd.equals("empty")){
                sb.append(q.isEmpty() ? 1 : 0).append("\n");

            }else if(cmd.equals("front")){
                if(q.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(q.peek()).append("\n"); // 앞 값 조회
                }

            }else if(cmd.equals("back")){
                if(q.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(last).append("\n"); // 마지막 값 (변수로 관리)
                }
            }
        }

        // 한 번에 출력
        System.out.print(sb);
    }
}