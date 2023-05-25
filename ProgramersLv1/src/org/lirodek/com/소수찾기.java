package org.lirodek.com;

public class 소수찾기 {
	
	public static void main(String[] args) {

		for(int i=0; i<=10; i++) {
			if(primeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean primeNumber(int number){
        if(number == 1 ){
            return false;
        }
        if( number == 2 || number == 3){
            return true;
        }
        if(number%2 == 0 || number%3 == 0){
            return false;
        }
        return true;
    }
}
