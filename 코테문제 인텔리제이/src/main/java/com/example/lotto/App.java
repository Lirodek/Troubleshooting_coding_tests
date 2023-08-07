package com.example.lotto;

import java.util.Arrays;
import java.util.OptionalInt;

public class App {
    public static void main(String[] args) {
        int lottos[] = {44,1,0,0,31,25};
        int win_number[] = {31,10,45,1,6,19};
        Arrays.stream(solution(lottos, win_number)).forEach(i-> System.out.println(i));
    }

    public static int[] solution(int lottos[], int win_number[]){
        int minimum = 0;
        int maximum = 0;
        for(int i=0; i<lottos.length; i++){
            final int const_win_number = win_number[i];
            if(Arrays.stream(lottos).filter(lotto -> lotto == const_win_number).findAny().orElseGet(()->-1) != -1){
                minimum++;
            }
            if(lottos[i] == 0){
                maximum++;
            }
        }
        minimum = rank(minimum);
        maximum = minimum - maximum + 1;

        return new int[]{maximum, minimum};
    }

    private static int rank(int lotto){
        switch (lotto){
            case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                return 6;
        }
    }
}
