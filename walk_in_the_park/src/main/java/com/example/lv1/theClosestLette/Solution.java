package com.example.lv1.theClosestLette;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution {

    public static void main(String[] args) {
        String s = "banana";

        int result[] = solution(s);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] solution(String s) {
        Map<Character, Integer> resultMap = new HashMap<>();
        int result[]= new int[s.length()];
        char temp;

        for(int i=0; i<s.length(); i++){
            temp = s.charAt(i);
            Optional<Integer> item = Optional.ofNullable(resultMap.get(temp));
            if(item.isPresent()){
                result[i] = i - item.get();
                resultMap.put(temp, i);
            }else {
                result[i] = -1;
                resultMap.put(temp, i);
            }


        }
        return result;
    }
}
