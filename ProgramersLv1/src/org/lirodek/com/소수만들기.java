package org.lirodek.com;

import java.util.ArrayList;
import java.util.List;

public class 소수만들기 {

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		int[] nums = {1,2,7,6,4};
		
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		for(int i=0; i<=100; i++) {
			if(prime_number(i)) {
				
			}
		}
        System.out.println(prime_number(1));
	}
	
	public static boolean prime_number(int number) {
		if(number == 2 || number == 3) {
			return true;
		}
		if(number % 2 == 0 || number % 3 == 0 || number == 1) {
			return false;
		}
		
		int sqrt = (int) Math.sqrt(number);
	    for (int i = 5; i <= sqrt; i += 6) {
	        if (number % i == 0 || number % (i + 2) == 0) {
	            return false;
	        }
	    }
		
		return true;
	}

}
