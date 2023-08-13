package com.example.lv1.walk_in_the_park;



import java.util.Arrays;

public class WalkInTheParkApplication {

	public static void main(String[] args) {
		String[] park = {"OOO","OSO","OOO","OOO"};
		String[] routes = {"N 2","S 2"};
		int loc[] = solution(park, routes);
		System.out.println("정답 :: " + loc[0] + ", " + loc[1]);
	}

	public static int[] solution(String[] park, String[] routes) {
		Location location;
		int[] thisLoc = new int[2];
		int[] nextLocation;
		int[] maxLoc = maxLoc(park);
		// 먼저 출발지점 S의 위치를 찾아야한다.
		for(int i = 0; i< park.length; i++){
			if(park[i].indexOf("S") != -1){
				thisLoc[0] = i;
				thisLoc[1] = park[i].indexOf("S");
			}
		}
		System.out.println("Start :: " + thisLoc[0] + ", " + thisLoc[1]);
		for(String route : routes){
			location = new Location(route);
			int rateValue[] = Arrays.copyOf(thisLoc, thisLoc.length);
			while(location.hasNext()){
				int[] tempLoc = Arrays.copyOf(rateValue, rateValue.length);
				nextLocation = walking(location, rateValue, maxLoc);

				boolean locStatus = !sameArray(tempLoc, nextLocation);
				locStatus = checkX(park, nextLocation, locStatus);

				if(!locStatus){
					break;
				} else {
					rateValue = nextLocation;
					location.next();
					if(location.count == 0){
						thisLoc = rateValue;
					}
				}
			}
		}

		return thisLoc;
	}

	private static int[] maxLoc(String[] park) {
		int result[] = new int[2];
		result[0] = park.length;
		result[1] = park[0].length();

		return result;
	}

	private static boolean checkX(String[] park, int[] nextLocation, boolean locStatus) {
		return String.valueOf( park[nextLocation[0]].charAt(nextLocation[1]) ).equals("X") ? false : locStatus;
	}

	private static boolean sameArray(int thisLoc[], int nextLocation[]){
		if(nextLocation[0] == thisLoc[0] && nextLocation[1] == thisLoc[1]){
			return true;
		}
		return false;
	}

	private static int[] walking(Location location, int[] thisLoc, int[] maxLength) {
		switch (location.location){
			case "N":
				thisLoc[0] = thisLoc[0] - 1 <= 0 ? 0 : thisLoc[0] - 1;
				break;
			case "W":
				thisLoc[1] = thisLoc[1] - 1 <= 0 ? 0 : thisLoc[1] - 1;
				break;
			case "S":
				thisLoc[0] = thisLoc[0] + 1 >= maxLength[0] ? maxLength[0] - 1 : thisLoc[0] + 1 ;
				break;
			case "E":
				thisLoc[1] = thisLoc[1] + 1 >= maxLength[1] ? maxLength[1] - 1 : thisLoc[1] + 1 ;
				break;

		}
		return thisLoc;
	}

	static class Location{
		String location;
		int count;
		Location(String location){
			String locations[] = location.split(" ");
			this.location = locations[0];
			count = Integer.parseInt(locations[1]);
		}
		int next(){
			return this.count--;
		}
		boolean hasNext(){
			return count == 0 ? false : true;
		}
	}

}
