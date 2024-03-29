package com.example.picv;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.stream.IntStream;

public class SolutionTemp {
    public static void main(String[] args) {
        String today[] = {"2022.05.19", "2020.01.01", "2016.02.15", "2020.05.17", "2022.02.28", "2024.06.08", "2024.06.08", "2020.12.17"};
        String terms[][] = {{"A 6", "B 12", "C 3"}, {"Z 3", "D 5"},{"A 100"},{"A 3", "B 12"}, {"A 23"}, {"A 18"}, {"A 18"}, {"A 12"}};
        String privacies[][] = {{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"},
                {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"},
                {"2000.06.16 A", "2008.02.15 A"},
                {"2020.01.01 A", "2020.05.17 B"},
                {"2020.01.28 A"}, {"2022.06.08 A", "2022.06.08 A", "2022.06.08 A"}, {"2022.06.08 A"},
                {"2010.01.01 A", "2019.12.17 A"}};
        int result[][] = {{1, 3}, {1, 4, 5}, {1}, {1}, {1}, {1, 2,3}, {1}, {1,2}};
        for(int i=result.length-1 ; i<result.length; i++){
            int resultSolution[] = solution(today[i], terms[i], privacies[i]);
            final int findIdx = i;
            if(result[i].length != resultSolution.length){
                System.out.println("배열의 갯수가 다름 실패");
                continue;
            }
            int getResult = IntStream.range(0, resultSolution.length).filter(idx -> resultSolution[idx] != result[findIdx][idx]).findAny().orElseGet(()->-1);
            if(getResult == -1){
                System.out.println(i+"번째 성공");
            } else {
                System.out.println(i+"번째 실패");
            }
        }
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = new int[privacies.length];
        HashMap<String, Integer> termsMap = new HashMap<>();
        String todays[] = today.split("\\.");
        int cnt=0;
        today = today.replace(".", "");
        for(String temp : terms){
            String tempArr[] =temp.split(" ");
            termsMap.put( tempArr[0], Integer.parseInt(tempArr[1]) );
        }

        for(int i=0; i<privacies.length; i++){
            String tempToday = privacies[i].split(" ")[0];
            String conditionsType = privacies[i].split(" ")[1];
            String tempArr[] = tempToday.split("\\.");

            Integer targetMonth = termsMap.get(conditionsType) + Integer.parseInt( tempArr[1] );
            Integer targetDay = Integer.parseInt(tempArr[2]);

            tempArr[1] = targetMonth<10 ? "0"+String.valueOf(targetMonth) : String.valueOf(targetMonth);
            tempArr[2] = targetDay < 10 ? "0" + String.valueOf(targetDay) : String.valueOf(targetDay);

            if(targetDay< 1){
                targetMonth -= 1;
                tempArr[1] = String.valueOf(targetMonth);
                targetDay = 28;
                tempArr[2] = targetDay < 10 ? "0" + String.valueOf(targetDay) : String.valueOf(targetDay);
            }
            if(targetMonth > 12 ){
                int excessYears = (targetMonth / 12);
                if(targetMonth % 12 == 0){
                    excessYears -= 1;
                }
                targetMonth = (targetMonth % 12) == 0 ? 1 : (targetMonth % 12);



                tempArr[0] = String.valueOf(Integer.parseInt( tempArr[0] )+excessYears);
                tempArr[1] = String.valueOf(targetMonth);
            }


            if(!(Integer.parseInt(tempArr[0]) <= Integer.parseInt(todays[0]))){
                continue;
            }else if(Integer.parseInt(tempArr[0]) == Integer.parseInt(todays[0])){
                if(!(Integer.parseInt(tempArr[1]) <= Integer.parseInt(todays[1]))){
                    continue;
                } else if(Integer.parseInt(tempArr[1]) == Integer.parseInt(todays[1])){
                    if(!(Integer.parseInt(tempArr[2]) < Integer.parseInt(todays[2]))){
                        continue;
                    }
                }
            }
            answer[cnt++] = i+1;

        }
        int result[] = new int[cnt];
        for(int i=0; i<cnt;i++){
            result[i] = answer[i];
        }



        return result;
    }
}
