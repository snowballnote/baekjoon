package baekjoon.p10773;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < K; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                list.remove(list.size() - 1); // 마지막 값 제거 (pop)
            }else{
                list.add(num); // 값 추가(push)
            }
        }

        int sum = 0;
        for(int n : list){
            sum += n;
        }

        System.out.println(sum);
    }
}