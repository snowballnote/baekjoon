package baekjoon.p9012;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 문제 풀이
        for (int i = 0; i < T; i++) {
            String str = br.readLine(); // 문자열 입력
            int count = 0;
            boolean isValid = true;

            for (char c : str.toCharArray()) {
                if (c == '(') {
                    count++;
                } else {
                    count--;
                }

                if (count < 0) {
                    isValid = false;
                    break;
                }
            }

            if (count == 0 && isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}