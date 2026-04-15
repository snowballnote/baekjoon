package baekjoon.p1966;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt((st.nextToken())); // 문서 개수
            int M = Integer.parseInt((st.nextToken())); // 찾을 문서 위치

            Queue<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            // (인덱스, 중요도)로 저장
            for(int i = 0; i < N; i++){
                int priority = Integer.parseInt(st.nextToken());
                q.add(new int[]{i, priority});
            }

            int count = 0; // 출력 순서

            while(!q.isEmpty()){
                int[] current = q.poll(); // 맨 앞 문서

                boolean isMax = true;

                // 현재 문서보다 더 큰 중요도 있는지 확인
                for(int[] doc : q){
                    if(doc[1]> current[1]){
                        isMax = false;
                        break;
                    }
                }

                if(isMax){
                    // 출력
                    count++;

                    if(current[0] == M){
                        sb.append(count).append("\n");
                        break;
                    }
                }else {
                    // 뒤로 보내기
                    q.add(current);
                }
            }
        }

        System.out.println(sb);
    }
}