package com.example.lv1.test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<String> newString = new ArrayList<>();
        newString.add("Hello");
        promotion(newString);
    }

    public static Object promotion(List<String> list){
        List<String> promotion = new ArrayList<>();
        List<String> resultObjList = new ArrayList<>();
        promotion.add("PRO1");
        promotion.add("PRO2");
        promotion.add("PRO3");
        for(String obj : promotion){

            for(String listObj : list){
                listObj = obj;
                resultObjList.add(listObj);
            }

        }
        resultObjList.forEach(System.out::println);
        return resultObjList;
    }
}
