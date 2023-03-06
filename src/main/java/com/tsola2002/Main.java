package com.tsola2002;

class Solution {

    public static boolean containsOnlyDigitsV1(String str) {

        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return false;
        }

        // this will loop through the string characters and break the loop if the method returns false
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

}

public class Main {

    private static final String ONLY_DIGITS = "45566336754493420932877387482372374982374823"
            + "749823283974232237238472392309230923849023848234580383485342234287943943094"
            + "234745374657346578465783467843653748654376837463847654382382938793287492326";

    private static final String NOT_ONLY_DIGITS = "45566336754493420932877387482372374982374823"
            + "749823283974232237238472392309230923849023848234580383485342234287943943094"
            + "234745374657346578465783467843653748654376837463847654382382938793287492326A";

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("Input text with only digits: \n" + ONLY_DIGITS + "\n");
        System.out.println("Input text with other characters: \n" + NOT_ONLY_DIGITS + "\n");

        System.out.println("Character.isDigit() solution:");
        // run the function to check if its only digits
        boolean onlyDigitsV11 = Solution.containsOnlyDigitsV1(ONLY_DIGITS);
        boolean onlyDigitsV12 = Solution.containsOnlyDigitsV1(NOT_ONLY_DIGITS);

        System.out.println("Contains only digits: " + onlyDigitsV11);
        System.out.println("Contains not only digits: " + onlyDigitsV12);
    }
}