package com.example.picv;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        String today[] = {"2022.05.19", "2020.01.01"};
        String terms[][] = {{"A 6", "B 12", "C 3"}, {"Z 3", "D 5"}};
        String privacies[][] = {{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"},
                {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"}};
        int result[][] = {{1, 3}, {1, 4, 5}};
        for(int i=0; i<result.length; i++){
            int resultSolution[] = solution(today[i], terms[i], privacies[i]);
            final int findIdx = i;
            int getResult = IntStream.range(0, resultSolution.length).filter(idx -> resultSolution[idx] != result[findIdx][idx]).findAny().orElseGet(()->-1);
            if(getResult == -1){
                System.out.println(i+"번째 성공");
            } else {
                System.out.println(i+"번째 실패");
            }
        }
    }

    public static int[] solution(String today, String[]terms, String[] privacies){
        return null;
    }
}
