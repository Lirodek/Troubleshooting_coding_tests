package org.lirodek.com;

public class 카카오_아이디만들기 {

	public static void main(String[] args) {
		String new_id = "z-+.^.";
		String answer = "";
        
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-zA-Z0-9-_.]", "");
        new_id = new_id.replaceAll("\\.+", ".");
        if(new_id.indexOf(".") ==  0) {
        	new_id = new_id.replaceFirst(".", "");
        }
        if(new_id.trim().length() == 0 ) {
        	new_id = "a";
        }
        if(new_id.length() > 15) {
        	new_id = new_id.substring(0, 14);
        }
        new_id = new_id.lastIndexOf(".") == new_id.length() -1 ? new_id.substring(0, new_id.length()-1): new_id;
        for(int i=new_id.length(); i < 3 ; i++) {
        	String temp = String.valueOf(new_id.charAt(new_id.length()-1));
        	new_id += temp;
        }
        System.out.println(new_id.length() > 3);
        System.out.println(new_id);
	}

}
