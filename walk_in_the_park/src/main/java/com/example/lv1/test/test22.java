package com.example.lv1.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test22 {
    public static void main(String[] args) {
<<<<<<< Updated upstream
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
=======
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);

        Optional<String> str;
        Stream<String> hello;
        List<String> newList = new ArrayList<>();
        for(Integer tempIdx : list) {
            if(tempIdx <= 2){
                continue;
            }
            newList.add( String.valueOf(tempIdx) );
        }
        list.stream().sorted((i1, i2)-> Integer.compare(i2,i1)).forEach(System.out::println);
        /*
        List<String> collect = list.stream()
                .filter(item -> item > 2)
                .map(item -> String.valueOf(item))
                .collect(Collectors.toList());


        collect.forEach(item -> System.out.println(item instanceof String));
        newList.stream().forEach(item -> System.out.println(item instanceof String));
        */


        //list.stream().skip(2).forEach(System.out::println);

        /*list.stream()
                .peek(num -> System.out.println("Processing: " + num))
                .map(num -> num * 2)
                .forEach(System.out::println);*/

         //list.stream().limit(2).forEach(System.out::println);
/*
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // 중첩된 리스트를 평면화하여 단일 레벨의 스트림 생성
        nestedList.stream()
                .flatMap(innerList -> innerList.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);
*/

        /*list.stream()
                .dropWhile(item -> item <= 2)
                .forEach(System.out::println);*/
        /*
        list.stream()
                .distinct()
                .forEach(System.out::println);*/
        /*list.stream().filter(i->i>=2).forEach(System.out::println);*/
        /*
        ArrayList<String> strList = new ArrayList<>();
        list.stream()
                .map(item->String.valueOf(item))
                .forEach(item-> System.out.println(item instanceof String));
        */

>>>>>>> Stashed changes

        list.stream().takeWhile(item -> item < 4).forEach(System.out::println);
        

<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
    }
}