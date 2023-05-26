package org.lirodek.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 숫자_짝궁_미완성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "100";
		String y = "203045";
		
		String answer = "";
		
		String arrX[] = stringToArray(x);
		String arrY[] = stringToArray(y);
		
		List<String> xList = new ArrayList<>( Arrays.asList(arrX) );
		List<String> yList = new ArrayList<>( Arrays.asList(arrY) );
		
		xList.sort(Comparator.reverseOrder());
		yList.sort(Comparator.reverseOrder());
		
		for(int i=0; i<xList.size(); i++) {
			String temp = xList.get(i);
			if(yList.remove(temp)) {
				answer+=temp;
			}
			

		}
		if(answer.length() == 0) {
			answer = "-1";
			System.out.println(answer);
		}
		if(String.valueOf(answer.charAt(0)).equals("0")) {
			answer = "0";
		}
		System.out.println(answer);

			
	}
	
	public static String[] stringToArray(String str) {
		String arr[] = new String[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i] = String.valueOf( str.charAt(i) );
		}
		
		return arr;
	}
}
