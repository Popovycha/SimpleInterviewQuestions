package com.gmail.mybmcc22;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(reverseWithStringBuilder(str));
        System.out.println(ReverseManually(str));
    }
    private static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    private  static String ReverseManually(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
