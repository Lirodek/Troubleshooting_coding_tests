package org.lirodek.com;

import java.util.ArrayList;
import java.util.List;


public class 나누어_떨어지는_숫자_배열 {
	/*
	문제 설명
	array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

	제한사항
	arr은 자연수를 담은 배열입니다.
	정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
	divisor는 자연수입니다.
	array는 길이 1 이상인 배열입니다.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> araylist = new ArrayList<>();
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		int[] answer = {-1};
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				index++;
				araylist.add(arr[i]);
			}
		}
		answer = index == 0 ? answer : new int[index];
		for(int i=0; i<araylist.size(); i++) {
			answer[i] = araylist.get(i);
		}

        for(int i=0; i<answer.length; i++) {
            int min = answer[i];
            int change = -1;
            int temp;
            for(int j=i; j<answer.length; j++) {
                if(answer[j]<min) {
                    min = answer[j];
                    change = j;
                }
            }
            if(change != -1) {
                temp = answer[i];
                answer[i] = min;
                answer[change] = temp;
            }
        }

        for(int temp : answer) {
        	System.out.println(temp);
        }
	}

}
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        for(int i=0; i<arr.length; i++) {
            int min = arr[i];
            int change = -1;
            int temp;
            for(int j=i; j<arr.length; j++) {
                if(arr[j]<min) {
                    min = arr[j];
                    change = j;
                }
            }
            if(change != -1) {
                temp = arr[i];
                arr[i] = min;
                arr[change] = temp;
            }
        }

        int i = 0;
        for(int temp : arr) {
            if(temp % divisor == 0) {
                i++;
            }
        }


        if( i == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[i];
            i = 0;
            for(int temp : arr) {
                if(temp % divisor == 0) {
                    answer[i++] = temp;
                }
            }
        }


        return answer;
    }
}