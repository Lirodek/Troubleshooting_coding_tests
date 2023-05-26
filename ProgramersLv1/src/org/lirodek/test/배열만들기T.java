package org.lirodek.test;

import java.util.ArrayList;

public class 배열만들기T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int[] solution(int n, int k) {
	      
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
