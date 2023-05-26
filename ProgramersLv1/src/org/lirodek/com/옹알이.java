package org.lirodek.com;

public class 옹알이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((float)3/2);
	}
	
	public static int recursiveCall(String babling) {
		int result = 0;
		if(babling.indexOf("aya") != -1) {
			babling.replace("aya", "aya|");
			result ++;
    	}
		if(babling.indexOf("ye") != -1) {
			babling.replace("ye", "ye|");
    		result ++;
    	}
		if(babling.indexOf("woo") != -1) {
			babling.replace("woo", "woo|");
    		result ++;
    	}
		if(babling.indexOf("ma") != -1) {
			babling.replace("ma", "ma|");
    		result ++;
    	}
		
		
		return result;
	}

}
