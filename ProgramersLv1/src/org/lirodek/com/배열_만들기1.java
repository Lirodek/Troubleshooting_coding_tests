package org.lirodek.com;

import java.util.ArrayList;
import java.util.List;

public class 배열_만들기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int k = 2;
		
		List<Integer> list = new ArrayList<>();
		int answer[] = {};
		
		for(int i = 0; i<n; i++) {
			if( i % k == 0)
				list.add(i);
		}
		answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
	}

}
