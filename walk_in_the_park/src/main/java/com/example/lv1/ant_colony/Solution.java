package com.example.lv1.ant_colony;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int solution = solution(23);
        System.out.println(solution);
    }

    public static int solution(int hp){
        int result= 0;
        final int GENERAL = 5;
        final int SOLDER = 3;
        final int ANT = 1;
        HashMap<String, Integer> test = new HashMap<>();

        if(hp >= GENERAL){
            result += hp / GENERAL;
            hp %= GENERAL;
        }
        if(hp >= SOLDER){
            result += hp / SOLDER;
            hp %= SOLDER;
        }
        if(hp >= ANT){
            result += hp / ANT;
        }

        return result;
    }
}
