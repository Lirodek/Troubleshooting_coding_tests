package main;

public class mainCls {

	public static void main(String[] args) {
		String text[] = {"aya", "yee", "u", "maa", "wyeoo"};
		solution(text);
	}
	
	public static int question1(int age) {
        int answer = 0;
        answer = 2023 - age;
        return answer;
    }
	
	public static int question2(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
	
	public static int question3(int num1, int num2) {
        int answer = num1 ==  num2 ? 1 : -1;
        return answer;
    }
	
	public static int question4(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }
	
	public static int question5(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }
	
	public static int question6(int num1, int num2) {
		int answer = num1 + num2;
		return answer;
	}
	
	public static int question7(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
	
	public static int solution(String[] babbling) {
        int answer = 0;
        
        for(String temp : babbling){
        	answer = recursiveCall(temp) > answer ? recursiveCall(temp) : answer;
        }
        
        return answer;
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
		System.out.println(babling);
		result = babling.equals("") ? result : 0;
		return result;
	}
	
}
