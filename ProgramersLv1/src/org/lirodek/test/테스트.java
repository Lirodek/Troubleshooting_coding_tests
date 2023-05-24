package org.lirodek.test;

public class 테스트 {
	public static void main(String[] args) {
		boolean answer = true;
		String s = "pYpypY";
        char p = 'p';
        char y = 'y';
        int cntP = 0;
        int cntY = 0;
        s = s.toLowerCase();
        
        if(s.length() <= 50 && s.matches("[a-zA-Z]+")){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == p){
                     System.out.println(" p출력");
                    cntP++;
                }
                 if(s.charAt(i) == y){
                     System.out.println(" y출력");
                    cntY++;
                }
            }
            
            if(cntP == cntY){
                answer = true;
            }else{
                answer = false;
            }
        }
        System.out.println(cntP);
        System.out.println(cntY);
	}
	
	class Solution {
	    boolean solution(String s) {
	       
	        boolean answer = true;
	        char p = 'p';
	        char y = 'y';
	        int cntP = 0;
	        int cntY = 0;
	        
	        if(s.length() <= 50 && s.matches("[a-zA-Z]+")){
	            for(int i = 0; i < s.length(); i++){
	                if(s.charAt(i) == p){
	                     System.out.println(" p출력");
	                    cntP++;
	                }
	                 if(s.charAt(i) == y){
	                     System.out.println(" y출력");
	                    cntY++;
	                }
	            }
	            
	            if(cntP == cntY){
	                answer = true;
	            }else{
	                answer = false;
	            }
	        }
	        
	        
	        
	 

	        return answer;
	    }
	}
}
