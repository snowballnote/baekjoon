package baekjoon.p2164;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 카드 개수

        Queue<Integer> q = new LinkedList<>(); // 큐 생성

        // 1부터 N까지 카드 넣기
        for(int i = 1; i <= N; i++){
            q.add(i);
        }

        // 카드가 1장 남을 때까지 반복
        while(q.size() > 1){
            q.poll(); // 맨 앞 카드 버림
            q.add(q.poll()); // 다음 카드 뒤로 이동
        }

        // 마지막 남은 카드 출력
        System.out.println(q.peek());
    }
}