package baekjoon.p10866;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력 모아서 처리

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new LinkedList<>(); // 덱 생성

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); // 공백으로 나누기.
            String cmd = st.nextToken();

            if(cmd.equals("push_front")){
                int x = Integer.parseInt(st.nextToken());
                dq.addFirst(x); // 앞에 추가

            }else if(cmd.equals("push_back")){
                int x = Integer.parseInt(st.nextToken());
                dq.addLast(x); // 뒤에 추가

            }else if(cmd.equals("pop_front")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(dq.pollFirst()).append("\n"); // 앞에서 제거
                }
            }else if(cmd.equals("pop_back")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(dq.pollLast()).append("\n"); // 뒤에서 제거
                }
            }else if(cmd.equals("size")){
                sb.append(dq.size()).append("\n");

            }else if(cmd.equals("empty")){
                sb.append(dq.isEmpty() ? 1 : 0).append("\n");

            }else if(cmd.equals("front")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(dq.peekFirst()).append("\n"); // 앞 조회
                }
            }else if(cmd.equals("back")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(dq.peekLast()).append("\n"); // 뒤 조회
                }
            }
        }

        System.out.print(sb);
    }
}