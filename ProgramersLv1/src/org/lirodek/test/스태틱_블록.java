package org.lirodek.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class 스태틱_블록 {
	static List<Score> score = new ArrayList<Score>();
	static Random rand = new Random();
	
	static {
		for(int i=0; i<10; i++) {
			Score person = new Score();
			person.eng = rand.nextInt(100) + 1;
			person.kor = rand.nextInt(100) + 1;
			person.math = rand.nextInt(100) + 1;
			score.add(person);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(Score temp : score) {
			System.out.println(temp.math);
		}
	}

}

class Score{
	int math;
	int eng;
	int kor;
}
