package com.example.lv1.reversthird;

import java.util.Arrays;
import java.util.Stack;

public class TrueSolution {
    public static void main(String[] args) {
        System.out.println(solution(125));


    }
    public static int solution(int number){
        int answer = 0;
        MyStack<Integer> stack = new MyStack<Integer>();

        while(true){
            stack.add(number%3);
            number = number / 3;
            if(number == 0)break;
        }


        for(int i=0; stack.hasNext(); i++){
            answer += stack.pop() * (Math.pow(3,i));
        }

        return answer;
    }

    public static class MyStack<T>{
        private Object value[];
        private int stackIndex = 0;
        private int maxSize = 0;

        public MyStack(){
            value = new Object[10];
            maxSize = 10;
        }
        public MyStack(int size){
            value = new Object[size];
            maxSize = size;
        }
        public void add(T getValue){
            value[stackIndex++] = getValue;
            sizeCheck();
        }

        public T pop(){
            T result = (T)value[stackIndex-1];
            value[stackIndex--] = null;
            return result ;
        }

        public int size(){
            return stackIndex;
        }

        public int getMaxSize(){
            return maxSize;
        }

        public T[] getArrays(){
            return (T[]) value;
        }

        public boolean hasNext(){
            return stackIndex == 0 ? false: true;
        }

        private void sizeCheck() {
            if (stackIndex > (maxSize / 2)) {
                maxSize = maxSize * 2;
                Object[] temp = Arrays.copyOf(value, maxSize);
                value = temp;
            }
        }

    }
}
