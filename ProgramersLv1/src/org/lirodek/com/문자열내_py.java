package org.lirodek.com;

public class 문자열내_py {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean answer = true;
		String str = "Pyy";
        str = str.toLowerCase();
        System.out.println(  str.replaceAll("[^p]", "").length() == str.replaceAll("[^y]", "").length() );
	}

}
