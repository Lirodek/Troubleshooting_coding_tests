package org.lirodek.com;

public class 내_마음대로_정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings= {"abce", "abcd", "cdx"};
		int n = 2;
		String temp = "";
		for(int i=0; i<strings.length; i++) {
			temp = "";
			int tempIdx = -1; 
			for(int j=i; j<strings.length; j++) {
				if(strings[i].charAt(n) >= strings[j].charAt(n)) {
					temp = strings[j];
					tempIdx = j;
				}
			}
			
			if(temp == "") {
				continue;
			} else {
				if(strings[i].charAt(n) > temp.charAt(n)) {
					temp = strings[i];
					strings[i] = strings[tempIdx];
					strings[tempIdx] = temp;
				} else if(strings[i].charAt(n) == temp.charAt(n)) {
					for(int j =0; j<strings[i].length(); j++) {
						if(strings[i].charAt(j) != strings[tempIdx].charAt(j)) {
							if( strings[i].charAt(j) > strings[tempIdx].charAt(j) ) {
								temp = strings[i];
								strings[i] = strings[tempIdx];
								strings[tempIdx] = temp;
							} else {
								break;
							}
							
						}
					}
				}
			}
		}
		
		for(String tempt : strings) {
			System.out.println(tempt);
		}
		
		
	}

}
