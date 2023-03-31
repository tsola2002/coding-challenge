package com.tsola2002;

import java.util.Arrays;
import java.util.Comparator;

class Solution {


}

public class Main {

    public static void main(String[] args) {

        String input = "laptop mobile and desktop are not exempt";
        String[] words = input.split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length)
              .thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(words));

    }
}