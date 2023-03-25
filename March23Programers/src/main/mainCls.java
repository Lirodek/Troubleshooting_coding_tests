package main;

public class mainCls {

	public static void main(String[] args) {
		question4(23, 34);
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
        int babblingArr[] = {0,0,0,0};
        for(String temp : babbling){
        	if(temp.indexOf("aya") != -1) {
        		babblingArr[0] = 1;
        	} else if(temp.indexOf("ye") != -1) {
        		babblingArr[1] = 1;
        	} else if(temp.indexOf("woo") != -1) {
        		babblingArr[2] = 1;
        	} else if(temp.indexOf("ma") != -1) {
        		babblingArr[3] = 1;
        	}
        }
        
        for(int temp : babblingArr) {
        	answer += temp == 1 ? 1 : 0 ;
        }
        return answer;
    }
	
}
