package com.gmail.mybmcc22;

public class ReverseAnInteger {
        public int reverse(int x) {

            if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return 0;

            long rev = 0;
            String tmp = Long.toString(Math.abs((long)x));

            String reverse = new StringBuffer(tmp).reverse().toString();

            rev = Long.parseLong(reverse);

            if( rev > (long)Integer.MAX_VALUE || rev < (long)Integer.MIN_VALUE
            ) return 0;

            return (int)(x < 0 ? -rev : rev);
    }
}
