package org.lirodek.com;

public class 문자열내_py {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean answer = true;
		String str = "Pyy";
		String p = "";
		String y = "";
        str = str.toLowerCase();

        
        p = p.replaceAll("[^p]", "");
        y = y.replaceAll("[^y]", "");
        System.out.println(p);
        System.out.println(y);

        System.out.println(  p.length() == y.length() );
	}

}
