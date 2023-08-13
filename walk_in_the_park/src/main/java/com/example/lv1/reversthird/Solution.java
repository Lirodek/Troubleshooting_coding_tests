package com.example.lv1.reversthird;

public class Solution {
    public static String thirdString = "";

    public static void main(String[] args) {
        System.out.println(solution(125));
    }
    public static int solution(int number) {
        getTriadNumber(number);
        return toTenNumber(new StringBuilder(thirdString).reverse().toString());
    }

    private static int toTenNumber(String string) {
        int result = 0;
        int tempNumber = 1;
        System.out.println(string);
        for(int i=0; i<string.length(); i++){
            int temp =  Integer.parseInt(String.valueOf(string.charAt(string.length() - (i + 1) )));
            tempNumber = i == 0 ? tempNumber : tempNumber * 3;
            result+= temp == 0 ? 0 : temp * tempNumber;
        }
        return result;
    }

    private static void getTriadNumber(int number) {
        int tempNumber = 1;
        int tempIdx = 0;
        for(int i=1; tempNumber < number - (tempNumber * 2); i++){
            tempNumber *= 3;
            tempIdx = i;

        }

        System.out.println(tempIdx + " : " + tempNumber);
        if(number >= (tempNumber * 2)){
            number -= (tempNumber * 2);
            thirdString+= "2";
        } else if(number >= tempNumber) {
            number -= (tempNumber);
            thirdString+= "1";
        } else {
            thirdString+= "0";
        }

        if(number > 0){
            getTriadNumber(number);
        }

    }
}
