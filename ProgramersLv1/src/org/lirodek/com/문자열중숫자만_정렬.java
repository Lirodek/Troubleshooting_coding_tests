package org.lirodek.com;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자열중숫자만_정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "hi12392";
		my_string = my_string.replaceAll("[^0-9]+", "");
		int numbers[] = new int[my_string.length()];
		for(int i =0; i<my_string.length(); i++) {
			numbers[i] = Integer.parseInt(String.valueOf(my_string.charAt(i)));
		
		}
		numbers = Arrays.stream(numbers).sorted().sorted().toArray();

	}

}
