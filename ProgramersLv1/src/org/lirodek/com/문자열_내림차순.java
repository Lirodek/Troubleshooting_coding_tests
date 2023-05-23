package org.lirodek.com;

public class 문자열_내림차순 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefgHijklmnopqrstuvwxyz";
		String result =  "";

		for (int i =122; i >= 97; i--) {
			if(s.indexOf(i) == -1) {
				continue;
			}
			
		    String c = String.valueOf(s.charAt(s.indexOf(i)));
		    result += c;
		}

		// 소문자 알파벳 a부터 z까지 출력
		for (int i = 90; i >= 65; i--) {
			if(s.indexOf(i) == -1) {
				continue;
			}
			String c = String.valueOf(s.charAt(s.indexOf(i)));
			result += c;
		}
		
		System.out.println(result);
		
	}

}
