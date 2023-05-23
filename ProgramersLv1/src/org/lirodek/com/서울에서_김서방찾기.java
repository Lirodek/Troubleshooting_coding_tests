package org.lirodek.com;

public class 서울에서_김서방찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="a2341";
		boolean result = true;
		if(!(s.length() == 4) && !(s.length() == 6)) {
			result = false;
		}
		try {
			Integer.parseInt(s);
		} catch (Exception e) {
			// TODO: handle exception
			result = false;
		}
		System.out.println(result);

	}

}
