package com.tsola2002;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {

    public static int calPoint(String[] ops){
        int a[] = new int[ops.length];
        int c = 0;
        int result = 0;


        for( int i = 0; i < ops.length; i++ ){

            if( ops[i].equals("+"))
                a[c++] = a[c-2] + a[c-3];
            else if(ops[i].equals("D"))
                a[c++] = 2 * a[c-2];
            else if(ops[i].equals("C")) c--;

            else a[c++]=Integer.parseInt(ops[i]);
        }

        for( int i = 0; i < c; i++ )
            result+=a[i];

        return result;
    }

}

public class Main {


    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        String[] ops = sc.nextLine().split(" ");

        System.out.println(Solution.calPoint(ops));

    }
}