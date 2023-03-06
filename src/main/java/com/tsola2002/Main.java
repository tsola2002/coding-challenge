package com.tsola2002;

import java.util.Scanner;
import java.util.Stack;

class Solution {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello world!");
//        String s1 = "()";
//        String s2 = "()[]{}";
//        String s3 = "(]";
//        String s4 = "([))";
//        String s5 = "{[]}";
//
//        System.out.println(Solution.isValid(s1)); // true
//        System.out.println(Solution.isValid(s2)); // true
//        System.out.println(Solution.isValid(s3)); // false
//        System.out.println(Solution.isValid(s4)); // false
//        System.out.println(Solution.isValid(s5)); // true

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(Solution.isValid(s)){
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

    }
}