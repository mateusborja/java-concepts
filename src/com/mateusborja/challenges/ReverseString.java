package com.mateusborja.challenges;

import javax.swing.*;

public class ReverseString {

    public static void main(String[] args) {


        String result = "";
        char[] array;

        String palavraInv = "";
        String input = JOptionPane.showInputDialog(null, "palavra para inverter: ");

        array = input.toCharArray();
        JOptionPane.showMessageDialog(null, inverteString(array, array.length - 1, palavraInv));

        System.exit(0);
    }


    static String inverteString(char array[], int size, String result) {

        result += array[size] + " ";

        if (size <= 0)
            return result;
        else
            return inverteString(array, size - 1, result);
    }

}
