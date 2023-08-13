package alpabet;

import java.util.Arrays;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        String s = "one4seveneight";
        //s = "0";
        solution(s);
    }

    public static int solution(String s){
        String alpabets[] = {"zero", "one","two","three","four","five","six","seven","eight","nine"};
        String result = "";

        while (s.length() != 0){
            char firstChar = s.charAt(0);
            if(firstChar >= '0' && firstChar <= '9'){
                result += firstChar;
                s = s.substring(1,s.length());
            } else {
                final String constS = s;
                String getItem = Arrays.stream(alpabets).filter(item -> constS.indexOf(item) == 0).findAny().get();
                int index = Arrays.asList(alpabets).indexOf(getItem);
                s = s.substring(getItem.length(),s.length());
                result += String.valueOf(index);

            }

        }

        return Integer.parseInt(result);
    }
}
