package baekjoon.p4949;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){ // 여러 줄 입력 처리(종료 조건 나올 때까지 반복)
            String str = br.readLine(); // 한줄 입력

            if(str.equals(".")) break;

            Stack<Character> stack = new Stack<>(); // 괄호 저장용 스택
            boolean isValid = true;

            // 문자열을 한 글자씩 순회
            for(char c : str.toCharArray()){

                // 여는 괄호면 스택에 push
                if(c == '(' || c == '['){
                    stack.push(c);
                }else if(c == ')'){
                    // 스택이 비어있거나 짝이 안 맞으면 실패
                    if(stack.isEmpty() || stack.pop() != '('){
                        isValid = false;
                        break;
                    }
                }else if(c == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        isValid = false;
                        break;
                    }
                }
                // 그 외 문자(알파벳, 공백 등)는 무시
            }

            // 반복 끝났는데 스택에 남아있으면 짝이 안 맞음
            if(!stack.isEmpty()) isValid = false;

            System.out.println(isValid ? "yes" : "no");
        }
    }
}