// word separeted single spaces
//no leading or trailing spaces
// the sky is blue - blue is sky the (string)

package com.mateusborja.challenges;

public class SolutionReverse {

    public void reverseWords(char[] str) {
        int len = str.length;
        if (len == 0) return;
        reverse(str, 0, len - 1);
        int start = 0;
        int end = 0;
        for (; end < len; end++) {
            while (end < len && str[end] != ' ') end++;
            if (end < len) {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str, start, end - 2);
    }

    private void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[start++] = str[end];
            str[end--] = temp;
        }
        return;
    }

    public static void main(String[] args) {

        SolutionReverse sr = new SolutionReverse();


        String[] str = new String[]{"abc", "abcd"};


        int ct = 10;
        String array[] = new String[ct];
        for (int x = 0; x < ct; x++)
            array[x] = String.valueOf(x);

        System.out.println(str[0] + "; " + str[1]);

    }
}
