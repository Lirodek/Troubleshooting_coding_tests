package org.lirodek.com;

public class 스킬체크Lv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution(")()("));

	}
	
	public static boolean solution(String s) {
        boolean answer = true;

        for(int i=0; i<s.length(); i++) {
        	int start;
        	int end;
        	start = s.indexOf("(");
        	end =   s.indexOf(")");
        	if( start == -1 || end == -1) {
        		return false;
        	}
        	if(end < start){
        		return false;
        	} else {
        		s = s.replaceFirst("\\(", "");
            	s = s.replaceFirst("\\)", "");
        	}
        }

        return answer;
    }

}
