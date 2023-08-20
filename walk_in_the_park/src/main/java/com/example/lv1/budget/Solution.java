package com.example.lv1.budget;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int d[] = {1,3,2,5,4};
        int budget = 9;
        int result = solution(d, budget);
        System.out.println(result);
    }

    private static int solution(int[] d, int budget) {
        int result = 0;
        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            budget -= d[i];
            if(budget >= 0){
                result++;
            } else {
                return result;
            }
        }

        return result;
    }
}
