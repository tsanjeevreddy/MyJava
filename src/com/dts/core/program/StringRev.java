package com.dts.core.program;

public class StringRev {

    public static void main(String[] args) {
        StringRev sol = new StringRev();
        System.out.println("Reversed String : " + sol.sol("mystring"));
        //System.out.println(new StringBuffer("testString").reverse().toString());
    }

    private String sol(String value) {
        char[] arrCh = value.toCharArray();
        System.out.println(arrCh);
        String revrse = "ddd";
        int start = 0;
        int end = arrCh.length - 1;
        while(start < end) {
            char temp = arrCh[start];
            arrCh[start] = arrCh[end];
            arrCh[end] = temp;
            start++;
            end--;
        }
        return new String(arrCh);
    }
}
