package org.lirodek.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class 완주하지_못한_선수 {

	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion =  {"josipa", "filipa", "marina", "nikola"};
		ArrayList<String> participantList = new ArrayList<>(Arrays.asList(participant));
		participantList.sort(Comparator.naturalOrder());
		Arrays.sort(completion);

        for(int i=0; i<participantList.size(); i++) {
        	try {
        		if(!participantList.get(i).equals(completion[i])) {
            		System.out.println(participantList.get(i));
            	}
        	} catch (Exception e) {
				// TODO: handle exception
        		System.out.println(participantList.get(i));
			}
        	
        }

		
		
	}

}
