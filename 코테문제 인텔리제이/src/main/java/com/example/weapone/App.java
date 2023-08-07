package com.example.weapone;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        solution(10, 3, 2);

    }

    public static int solution(int number, int limit, int power){
        int answer = 0;
        int temp;

        for(int i=1; i<=number; i++){
            if(i == 1){
                answer += 1;
                continue;
            }
            temp = getDivisor(i);
            answer += temp > limit ? power : temp;
        }
        return answer;
    }

    public static int getDivisor(int number){
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if(number%i == 0){
                divisors.add(i);
                if(i != number / i){
                    divisors.add(number / i);
                }
            }
        }
        return divisors.size();
    }
}
