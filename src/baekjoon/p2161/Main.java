package baekjoon.p2161;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 큐 생성
        Queue<Integer> q = new LinkedList<>();

        // 1부터 N까지 카드 넣기
        for(int i = 1; i <= N; i++){
            q.add(i);
        }

        StringBuilder sb = new StringBuilder(); // 출력 모아서 처리

        // 카드가 없어질 때까지 반복
        while(!q.isEmpty()){
            // 맨 위 카드 버리고 출력
            sb.append(q.poll()).append(" ");

            // 다음 카드가 있으면 뒤로 이동
            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }

        // 결과 출력
        System.out.println(sb);
    }
}