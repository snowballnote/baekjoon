package baekjoon.p1021;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 큐 크기
        int M = Integer.parseInt(st.nextToken()); // 뽑을 개수

        Deque<Integer> dq = new LinkedList<>();

        // 1~N까지 채우기
        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }

        st = new StringTokenizer(br.readLine());

        int count = 0; // 이동 횟수

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            // 목표 위치 찾기
            int index = 0;
            for (int x : dq) {
                if (x == target) break;
                index++;
            }

            // 왼쪽 이동이 빠른 경우
            if (index <= dq.size() / 2) {
                while (dq.peekFirst() != target) {
                    dq.addLast(dq.pollFirst()); // 왼쪽 회전
                    count++;
                }
            } else {
                // 오른쪽 이동이 빠른 경우
                while (dq.peekFirst() != target) {
                    dq.addFirst(dq.pollLast()); // 오른쪽 회전
                    count++;
                }
            }

            dq.pollFirst(); // 목표 제거
        }

        System.out.println(count);
    }
}