package com.nisren.findnumber;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        int[] numberArray = {1,2,3,7};
        int[] output = main.twosums(numberArray,9);
        System.out.println("The index of the numbers in array are: "+Arrays.toString(output));
    }
    public int[] twosums(int[] numberArray, int givenNumber){
        for (int i=0;i<numberArray.length; i++){
            for (int j=i+1; j<numberArray.length;j++){
                if (numberArray[i]+numberArray[j]==givenNumber){
                    return new int[] { i, j};
                }
            }
        }
        throw new IllegalArgumentException("No numbers with sum equal to the given number found");
    }
}
