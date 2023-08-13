package com.example.lv1.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class test22 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<String> strList = new ArrayList<>();
        for(Integer i : list){
            String str = String.valueOf(i);
            if(!str.startsWith("1")){
                continue;
            }
            strList.add(String.valueOf(i));
        }



        List<String> collect = list.stream().map(i -> String.valueOf(i)).filter(str->str.startsWith("1")).collect(Collectors.toList());
    }
}